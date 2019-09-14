package test;

import service.DBTools;

/**
 * @AUTHOR :yuankejia
 * @DESCRIPTION:
 * @DATE:CRETED: IN 12:45 2019/9/7
 * @MODIFY:
 */
class BackUpA extends Thread{
    private DBTools dbTools;
    BackUpA(DBTools dbTools){
        super();
        this.dbTools = dbTools;
    }
    public void run(){
        dbTools.backupA();
    }
}

class BackUpB extends Thread{
    private DBTools dbTools;
    BackUpB(DBTools dbTools){
        super();
        this.dbTools = dbTools;
    }
    public void run(){
        dbTools.backupB();
    }
}

public class Run4 {
    public static void main(String[] args) {
        DBTools dbTools = new DBTools();
        for(int i = 0;i<20;i++){
            BackUpB output = new BackUpB(dbTools);
            output.start();
            BackUpA input = new BackUpA(dbTools);
            input.start();
        }
    }


}
