package practice16;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/*
 */
public class PTra16_01 {
    public static void main(String[] args) {

        /*
        * ★ java.util.Dateクラスを使って、自分の生年月日を「YYYY年MM月DD日」形式で出力してください
        *  ※　他の標準クラスも使って良いです
        */
    	Calendar cl = Calendar.getInstance();
    	cl.set(Calendar.YEAR,1991);
    	cl.set(Calendar.MONTH,11);
    	cl.set(Calendar.DATE,22);
    	SimpleDateFormat f = new SimpleDateFormat("yyyy年MM月dd日");
    	//String datestr = f.format(cl);
    	System.out.println(f.format(cl.getTime()));
    }
}