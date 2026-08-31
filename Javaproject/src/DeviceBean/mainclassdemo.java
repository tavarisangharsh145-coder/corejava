package DeviceBean;

import java.util.Scanner;

public class mainclassdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		Devicebean d=new Devicebean();

		System.out.println("Enter Device ID:-");
		d.setDeviceID(sc.nextInt());
		
		System.out.println("Enter Device name:-");
		d.setDeviceNmae(sc.next());
		
		System.out.println("Enter Device OS:-");
		d.setIntdeviceOS(sc.next());
		
		System.out.println("Enter kernal Version:-");
		d.setIntkernalVersion(sc.nextInt());
		
		System.out.println("Enter Date:-");
		d.setDate(sc.next());
		
		System.out.println("Enter IMEICODE:-");
		d.setIMICODE(sc.nextInt());
		
		System.out.println("Enter Ram Details:-");
		d.setRAMDETAILS(sc.next());
		
		System.out.println("Enter Device Type:-");
		d.setDEVICETYPE(sc.next());
		
		System.out.println("Enter Password:-:");
		d.setPASSWORD(sc.next());
		
		System.out.println("Enter Confirm Password:-");
		d.setCONFIRMPASSWORD(sc.next());
		
		
		
		
		
		
		
		
	}

}
