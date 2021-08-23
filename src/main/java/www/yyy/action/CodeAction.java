package www.yyy.action;

import org.apache.struts2.ServletActionContext;
import www.yyy.yzm.SecurityCode;
import www.yyy.yzm.SecurityImage;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.IOException;


public class CodeAction{
	
	public String code() throws IOException{
		String code= SecurityCode.getSecurityCode();
		HttpSession session=ServletActionContext.getRequest().getSession(true);
		session.setAttribute("cod", code);
		
		BufferedImage img= SecurityImage.createImage(code);
		ImageIO.write(img, "png", ServletActionContext.getResponse().getOutputStream());
		return null;
	}
}
