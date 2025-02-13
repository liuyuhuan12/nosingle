package 第十一周作业改造版;
import production.*;
import user.*;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.*;
import java.io.*;
public class XMLUtility {
	public static Object getBean(){
		try{
			DocumentBuilderFactory dFactory=DocumentBuilderFactory.newInstance();
			DocumentBuilder builder=dFactory.newDocumentBuilder();
			Document doc=builder.parse(new File("config.xml"));
			
			NodeList nl=doc.getElementsByTagName("className");
			Node classNode=nl.item(0).getFirstChild();
			String  cName=classNode.getNodeValue();
			
			Class c=Class.forName(cName);
			Object obj=c.newInstance();
			return obj;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
}
