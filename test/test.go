package main

import (
	"fmt"
	"runtime"
)

type PanicContext struct {
	message string
}

func ProtectRun(entry func()){

	defer func() {
		error := recover()
		switch error.(type) {
		case runtime.Error:
			fmt.Println("runtime error",error)
		default:
			fmt.Println("other error",error)
		}
	}()

	entry()
}



func main()  {
	fmt.Println("运行前")
	ProtectRun(func() {
		fmt.Println("手动宕机前")
		panic(&PanicContext{"手动触发panic"})
		fmt.Println("手动触发宕机之后")
	})

	ProtectRun(func() {
		fmt.Println("赋值宕机前")
		var a *int
		*a = 1
		fmt.Println("赋值宕机之后")
	})

}