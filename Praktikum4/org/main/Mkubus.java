package org.main;

import org.bangunruang.Kubus;

public class MKubus{
public static void main(String[] args){
	Kubus kubus = new Kubus(4);
	kubus.printInfo();
	System.out.println("Volume Kubus : "+kubus.hitungVolume());
	System.out.println("Luas Alas Kubus : "+kubus.hitungLuasAlas());
	}
}