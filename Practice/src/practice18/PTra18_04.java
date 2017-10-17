/*
 * PTra18_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PTra18_04 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */
		ArrayList<Player> array = new ArrayList<Player>();
        try(Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                String[] s = line.split(",",0);
                Player p = new Player();
             	p.setPosition(s[0]);
             	p.setName(s[1]);
             	p.setCountry(s[2]);
             	p.setTeam(s[3]);
             	array.add(p);


            }
        } catch (FileNotFoundException e) {
            System.out.println("ファイルが見つかりません");
        }


		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください
        Collections.shuffle(array);
        int gk = 1;
        int df = 1;
        int mf = 1;
        int fw = 1;
     	for(Player s : array) {

     		if(s.getPosition().equals("GK")&&gk == 1) {
     			gk++;
     			System.out.println(s.toString());
     		}

     		if(s.getPosition().equals("DF")&&df <= 4) {
     			df++;
     			System.out.println(s.toString());
     		}

     		if(s.getPosition().equals("MF")&&mf <= 4) {
     			mf++;
     			System.out.println(s.toString());
     		}

     		if(s.getPosition().equals("FW")&&fw <= 2) {
     				fw++;

     				System.out.println(s.toString());
     		}
     	}
	}
}
