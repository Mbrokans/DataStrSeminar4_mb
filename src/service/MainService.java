package service;

import dateStr.MyGraph;
import model.city;

public class MainService {

	public static void main(String[] args) {
		MyGraph<city> map = new MyGraph<city>();
		try {
			city c1 = new city("Ventspils", 55.4f, "LV-3601");//[0]
			city c2 = new city("Tukums",13.35f,"LV-3101");//[1]
			city c3 = new city("Rīga",307.2f, "LV-3401");//[2]
			city c4 = new city("Talsi",7.85f, "LV-3201") ;//[3]
			city c5 = new city("Saldus",10.1f,"LV-3501");//[4]
			city c6 = new city("Liepāja",68.02f, "LV-3001");//[5]
			city c7 = new city("Kuldīga",13,"LV-3301") ;//[6]
			
			
			map.addVertice(c1);
			map.addVertice(c2);
			map.addVertice(c3);
			map.addVertice(c4);
			map.addVertice(c5);
			map.addVertice(c6);
			map.addVertice(c7);
			
			map.addEdge(c1, c3, 190);
			map.addEdge(c1, c7, 60);
			map.addEdge(c1, c6, 111);
			map.addEdge(c1, c4, 75);
			map.addEdge(c4, c2, 55);
			map.addEdge(c2, c3, 67);
			map.addEdge(c7, c5, 51);
			//TODO papildināt ar citiem ceļiem
			
			map.print();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
