package net_device;

import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

/**
 * @AUTHOR :yuankejia
 * @DESCRIPTION:
 * @DATE:CRETED: IN 19:16 2019/9/9
 * @MODIFY:
 */
public class Test1 {
    public static void main(String[] args) throws SocketException {
        Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
        while(networkInterfaces.hasMoreElements() ){
            NetworkInterface eachNetworkInterface = networkInterfaces.nextElement();
            System.out.println("名称:"+eachNetworkInterface.getName());
            /*System.out.println("显示名称:"+eachNetworkInterface.getDisplayName());
            System.out.println("接口索引:"+eachNetworkInterface.getIndex());
            System.out.println("是否运行:"+eachNetworkInterface.isUp());
            System.out.println("是否回调:"+eachNetworkInterface.isLoopback());*/
            System.out.println("物理地址:"+eachNetworkInterface.getHardwareAddress());
        }
    }
}
