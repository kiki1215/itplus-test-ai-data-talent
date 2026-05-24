package hmk;

import java.text.Normalizer;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;


public class QLTaiKhoan {
	private ArrayList<TaiKhoan> list;

    public QLTaiKhoan() {
        list = new ArrayList<>();
    }
    
    public void nhapTaiKhoan(Scanner sc, int n) {
    	for(int i = 0; i< n; i++) {
    		System.out.println("Tai khoan " + (i + 1) + " :");
    		System.out.print("Nhap ten: ");
    		String name = sc.nextLine();
    		System.out.print("Nhap so tien: ");
    		double money = Double.parseDouble(sc.nextLine());
    		TaiKhoan a = new TaiKhoan(name, money);
    		list.add(a);
    	}
    }
    public String boDau(String s) {
    	String temp = Normalizer.normalize(s, Normalizer.Form.NFD); 
    	temp = temp.replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
    	temp = temp.toLowerCase();
    	temp = temp.replace('đ','d');
    	return temp;
    }
    public int mucDo(String key, String name) {
    	if(name.startsWith(key)) {
    		return 3;
    	}
    	if(name.contains(key)) {
    		return 2;
    	}
    	for (char c : key.toCharArray()) {
    	    if (name.indexOf(c) != -1) {
    	        return 1;
    	    }
    	}
    	return 0;
    }
   
    public void sapXepTaiKhoan(String key) {
    	Collections.sort(list, (a,b) -> {
    		int mucA = mucDo(key, boDau(a.getName()));
        	int mucB = mucDo(key, boDau(b.getName()));
        	if (mucA > mucB) {
        		return -1; 
        	}else if(mucA < mucB) {
        		return 1;
        	}else {
        		return Double.compare(b.getMoney(), a.getMoney());
        	}
    	});
    }
    public static String formatMoney(double money) {
        Locale vn =  Locale.of("vi ","VN");
        NumberFormat nf = NumberFormat.getNumberInstance(vn);
        return nf.format(money) + " USD";
    }
    public void showTop3(String key) {
    	key = boDau(key);
        sapXepTaiKhoan(key);
        double sum = 0;
        int count = 0;
    	System.out.println("Danh sach top 3 tai khoan: ");
    	for( TaiKhoan a: list) {
    		int muc = mucDo(key, boDau(a.getName()));
    		if(muc > 0) {
    			System.out.println(a.getName() + " - " + formatMoney(a.getMoney()));
    			sum += a.getMoney();
    			count++;
    			if(count == 3) {
    				break;
    			}
    		}
    	}
    	System.out.println("Tong tien top 3: " + formatMoney(sum));
    }
}
