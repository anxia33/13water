package demo.demo9;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
public class App {
	static String tocken;
	public static void main(String []args) throws Throwable
	{
//		zhuce("111","222");
//		zhuce("easonxu","123456","031702134","990403xu");
//		System.out.println(r);
//		zhuce1("22122","111111");
	
		int i ;
for(i=0;i<1000;i++) {
	if(i%10==0)
	dengru("031702106","HUANG0529");
		start();}
System.out.println(i);
//		pai();
//		zhanji("1","1","1");
//		xiangqing("224466");
	}
//	HttpResponse<String> response = Unirest.post("https://api.shisanshui.rtxux.xyz/auth/register2")
//			  .header("content-type", "application/json")
//			  .body("{\"username\":\"test1\",\"password\":\"test1\",\"student_number\":\"xxx\",\"student_password\":\"xxxx\"}")
//			  .asString();
	public static int zhuce(String un,String psw,String sid,String spwd) throws UnirestException
	{
		String boody="{\"username\":"+"\""+un+"\","+"\"password\":"+"\""+psw+"\","+"\"student_number\":"+"\""+sid+"\","+"\"student_password\":"+"\""+spwd+"\"}";
//		System.out.println(boody);
		HttpResponse<String> response = Unirest.post("http://api.revth.com/auth/register2")
				  .header("content-type", "application/json")
				  .body(boody)
				  .asString();
		String body=response.getBody();
		System.out.println(body);
		System.out.println(boody);
		if(body.indexOf(":0,")!=-1) {
		System.out.println("注册成功");
		return 1;
		}
		else {System.out.println("用户名已被注册");
		return 2;
		}
	}
	public static int zhuce1(String un,String psw) throws UnirestException
	{
		String boody="{\"username\":"+"\""+un+"\","+"\"password\":"+"\""+psw+"\"}";
//		System.out.println(boody);
		HttpResponse<String> response = Unirest.post("http://api.revth.com/auth/register")
				  .header("content-type", "application/json")
				  .body(boody)
				  .asString();
		String body=response.getBody();
		System.out.println(body);
		System.out.println(boody);
		if(body.indexOf(":0,")!=-1) {
		System.out.println("注册成功");
		return 1;
		}
		else {System.out.println("用户名已被注册");
		return 2;
		}
	}
	
	public static int  dengru(String un,String psw) throws UnirestException
	{
		String boody="{\"username\":"+"\""+un+"\","+"\"password\":"+"\""+psw+"\"}";
		HttpResponse<String> response = Unirest.post("http://api.revth.com/auth/login")
				  .header("content-type", "application/json")
				  .body(boody)
				  .asString();
		String body=response.getBody();
		System.out.println(body);
		if(body.indexOf("\"status\":0")!=-1) {
		int addstart=body.indexOf("user_id\":");
		int addend=body.indexOf(",\"token");
//		String id=body.substring(addstart+9,addend);
		addstart=body.indexOf("token\":\"");
		addend=body.indexOf("\"}");
		tocken=body.substring(addstart+8, addend);
//		start(tocken);
//		System.out.println(id);
		System.out.println(tocken);
		return 1;
		}else {
			System.out.println("登录失败，用户名或密码错误");
			return 2;
		}
	}
	
	public static String start() throws UnirestException
	{
		HttpResponse<String> response = Unirest.post("http://api.revth.com/game/open")
				  .header("X-Auth-Token", tocken)
				  .header("content-type", "application/json")
				  .asString();
		String body=response.getBody();
		System.out.println(body);
//		return body;
		int s=body.indexOf("card\":\"");
		int e=body.indexOf("\"}");
		String card=body.substring(s+7, e);
		thirteenwater work=new thirteenwater();
		String cardout=work.workcard(card);
		s=body.indexOf("id\":");
		e=body.indexOf(",\"card");
		String id=body.substring(s+4, e);
		String bodyout=new String();
		bodyout="{\"id\":"+id+",\"card\":[\""+cardout+"\"]}";
		System.out.println(bodyout);
//		System.out.println(card);
		handin(bodyout);
		return cardout;
	}

	public static void handin(String b) throws UnirestException
	{
		HttpResponse<String> response = Unirest.post("http://api.revth.com/game/submit")
				  .header("content-type", "application/json")
				  .header("x-auth-token", tocken)
				  .body(b)
				  .asString();
		System.out.println(response.getBody());
	}
	public static String pai() throws UnirestException {
		
		HttpResponse<String> response = Unirest.get("http://api.revth.com/rank" )
				.header("content-type", "application/json")
				  .asString();
		String str=response.getBody();
		System.out.println(str);
		return str;
	}
	public static String zhanji(String page,String limit,String pid) throws UnirestException {
		String str="http://api.revth.com/history"+"?"+"page="+page+"&"+"limit="+limit+"&"+"player_id="+pid;
		HttpResponse<String> response = Unirest.get(str)
				  .header("x-auth-token", tocken)
				  .asString();
		String body=response.getBody();
		System.out.println(body);
		return body;
	}
	public static String xiangqing(String id) throws UnirestException {
		String str="http://api.revth.com/history/"+id;
		HttpResponse<String> response = Unirest.get(str)
				  .header("x-auth-token", tocken)
				  .header("content-type", "application/json")
				  .asString();
		String body=response.getBody();
		System.out.println(body);
		return body;
	}
}
