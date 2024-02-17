package SeleniumConcepts;

import com.test.demoblaze.JavaFakerClass;
import com.test.demoblaze.UsernameRD;

public class publicAccessmodifer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaFakerClass JF=new JavaFakerClass();
		JF.fakermethodpublic();//Accessing with object
		UsernameRD.undefault();//accessing directly as its static method.
	//	UsernameRD.pwdpublic(); -its public so need to make it either static or create object.
	//	LoginHRM.LoginwithCorrectCredentails();//another project
	}

}
