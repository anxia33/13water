package demo.demo9;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;
import java.util.Vector;

import javax.swing.*;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;

import com.mashape.unirest.http.exceptions.UnirestException;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

class register extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1273111557230461505L;

	@SuppressWarnings("deprecation")
	public register(){
		JFrame jf=new JFrame("注册界面");  
		JButton button1 = new JButton("注册");
		JLabel L1=new JLabel("账号:");
		JTextField te1=new JTextField(30);        //账号输入框 括号内是输入框长度
		JLabel L2=new JLabel("密码:");
		JPasswordField te2=new JPasswordField(30);//   PasswordField 的使用  密码输入框
		JLabel L4=new JLabel("学号:");
		JTextField te4=new JTextField(30);        //账号输入框 括号内是输入框长度
		JLabel L5=new JLabel("密码:");
		JPasswordField te5=new JPasswordField(30);//   PasswordField 的使用  密码输入框
		JLabel L3=new JLabel("注册成功");
		te2.setEchoChar('*');
		ImageIcon background = new ImageIcon(this.getClass().getResource("/jpg/backgroud.jpg"));	//创建一个背景图片
		JLabel label = new JLabel(background);		//把背景图片添加到标签里
		label.setBounds(0, 0, background.getIconWidth(), background.getIconHeight());	//把标签设置为和图片等高等宽
		JPanel myPanel = (JPanel)jf.getContentPane();		//把我的面板设置为内容面板
		myPanel.setOpaque(false);					//把我的面板设置为不可视
		myPanel.setLayout(null);		//把我的面板设置为绝对布局
		jf.getLayeredPane().setLayout(null);		//把分层面板的布局置空
		L1.setBounds(190, 160, 200, 30);
		L2.setBounds(190, 200,200, 30);
		te1.setBounds(250, 165, 200, 20);
		te2.setBounds(250, 205, 200, 20);
		L4.setBounds(190, 10, 200, 30);
		L5.setBounds(190, 50, 200, 30);
		te4.setBounds(250, 15, 200, 20);
		te5.setBounds(250, 55, 200, 20);
		button1.setBounds(300,250, 100, 20);
		myPanel.add(L1);
		myPanel.add(te1);
		myPanel.add(L2);
		myPanel.add(te2);
		myPanel.add(button1);
		myPanel.add(L3);
		myPanel.add(L4);
		myPanel.add(L5);
		myPanel.add(te4);
		myPanel.add(te5);
		jf.getLayeredPane().add(label, new Integer(Integer.MIN_VALUE));		//把标签添加到分层面板的最底层
		//设置界面属性
		jf.setResizable(false);
		jf.setBounds(300, 300, background.getIconWidth(), background.getIconHeight());
		jf.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		jf.setVisible(true);
		button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
					String username=te1.getText().toString();
					String password=te2.getText().toString();
					String sid=te4.getText().toString();
					String spwd=te5.getText().toString();
//					System.out.println(password);
					if(sid!=""&&spwd!="") {
					try {
						if(App.zhuce(username, password,sid,spwd)==1) {
							L3.setText("注册成功");
							L3.setSize(background.getIconWidth(), background.getIconHeight());
							L3.setFont(new Font("宋体", Font.BOLD | Font.ITALIC, 30));
						}
						else {
							L3.setText("注册失败");
							L3.setSize(background.getIconWidth(), background.getIconHeight());
							L3.setFont(new Font("宋体", Font.BOLD | Font.ITALIC, 30));
						}
						
					} catch (UnirestException e1) {
						// TODO 自动生成的 catch 块
						e1.printStackTrace();
					}
			}else {
				try {
					if(App.zhuce1(username, password)==1) {
						L3.setText("注册成功");
						L3.setSize(background.getIconWidth(), background.getIconHeight());
						L3.setFont(new Font("宋体", Font.BOLD | Font.ITALIC, 30));
					}
					else {
						L3.setText("注册失败");
						L3.setSize(background.getIconWidth(), background.getIconHeight());
						L3.setFont(new Font("宋体", Font.BOLD | Font.ITALIC, 30));
					}
					
				} catch (UnirestException e1) {
					// TODO 自动生成的 catch 块
					e1.printStackTrace();
				}
			}
			}
		});
	    }
	}

@SuppressWarnings("serial")
class MainGUI extends JFrame{
	@SuppressWarnings("deprecation")
	public MainGUI() {
    	JFrame jf=new JFrame();
    	JButton jb1=new JButton();
    	JButton jb2=new JButton();
    	JButton jb3=new JButton();
    	Icon icon=new ImageIcon(this.getClass().getResource("/jpg/2.jpg"));
    	jb1.setIcon(icon);
    	icon=new ImageIcon(this.getClass().getResource("/jpg/3.jpg"));
    	jb2.setIcon(icon);
    	icon=new ImageIcon(this.getClass().getResource("/jpg/5.jpg"));
    	jb3.setIcon(icon);
		ImageIcon background = new ImageIcon(this.getClass().getResource("/jpg/1.jpg"));	//创建一个背景图片
		JLabel label = new JLabel(background);		//把背景图片添加到标签里
		label.setBounds(0, 0, background.getIconWidth(), background.getIconHeight());	//把标签设置为和图片等高等宽
		JPanel myPanel = (JPanel)jf.getContentPane();		//把我的面板设置为内容面板
		myPanel.setOpaque(false);					//把我的面板设置为不可视
		myPanel.setLayout(null);		//把我的面板设置为绝对布局
		jf.getLayeredPane().setLayout(null);		//把分层面板的布局置空
		myPanel.add(jb1);
		myPanel.add(jb2);
		myPanel.add(jb3);
		jb1.setBounds(30, 50, 300, 500);
		jb2.setBounds(400, 50, 300, 500);
		jb3.setBounds(770, 50, 300, 500);
		jf.getLayeredPane().add(label, new Integer(Integer.MIN_VALUE));		//把标签添加到分层面板的最底层
		//设置界面属性
//		jf.setResizable(false);
		jf.setTitle("选择界面");
		jf.setBounds(300, 300, background.getIconWidth(), background.getIconHeight());
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
		jb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
		
				try {
					String card = App.start();
					gameGUI g=new gameGUI(card);
					g.setVisible(true);
					g.dispose();
				} catch (UnirestException e1) {
					// TODO 自动生成的 catch 块
					e1.printStackTrace();
				}

			}
		});
		jb2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				String str;
				try {
					str = App.pai();
					paihang p=new paihang(str);
					p.setVisible(true);
					p.dispose();
				} catch (UnirestException e1) {
					// TODO 自动生成的 catch 块
					e1.printStackTrace();
				}
				 
			}
		});
		jb3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				lishi l=new lishi();
				l.setVisible(true);
				l.dispose();
			}
		});
    }
}
class paihang extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2526005716984538407L;

	public paihang(String str) {
		JSONArray json = JSONArray.fromObject(str);  
		int x=json.size();
		JFrame f = new JFrame("排行榜");
        f.setSize(500, 300);
        f.setLocation(300, 300); 
        f.setLayout(new BorderLayout());
        Vector<String>lie=new Vector<>();
        lie.add("排名");
        lie.add("id");
        lie.add("分数");
        lie.add("名字");
        Vector<Vector<String>>shuju=new Vector<>();
        for(int i=0;i<x;i++) {
        	Vector<String>row=new Vector<>();
        	row.add(String.valueOf(i+1));
        	row.add(json.getJSONObject(i).get("player_id").toString());
        	row.add(json.getJSONObject(i).get("score").toString());
        	row.add(json.getJSONObject(i).get("name").toString());
        	shuju.add(row);
        }
        JTable t = new JTable(shuju,lie);
        final JScrollPane sp = new JScrollPane(t);
        f.getContentPane().add(sp,BorderLayout.CENTER);
        JTableHeader th=t.getTableHeader();
        f.getContentPane().add(th,BorderLayout.NORTH);
        f.add(sp);
        f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        f.setVisible(true);
	}
}
class gameGUI extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4066697076039959175L;

	@SuppressWarnings("deprecation")
	public gameGUI(String cardout){
		 cardout=cardout.replaceAll("\",\"", " ");
		 cardout=cardout.replaceAll("#", "方块");
		 cardout=cardout.replaceAll("&", "红桃");
		 cardout=cardout.replaceAll("\\*", "草花");
		 cardout=cardout.replaceAll("\\$", "黑桃");	
	     String[] str=cardout.split("\\s");
		JFrame jf=new JFrame("游戏界面"); 
	    JButton[] b=new JButton[13];
	    for(int i=0; i<13; i++){
	    JButton btn = new JButton();
	    b[i] = btn;
	    }
		JButton button1 = new JButton("结束");
		ImageIcon background = new ImageIcon(this.getClass().getResource("/jpg/timg.jpg"));	//创建一个背景图片
		JLabel label = new JLabel(background);		//把背景图片添加到标签里
		label.setBounds(0, 0, background.getIconWidth(), background.getIconHeight());	//把标签设置为和图片等高等宽
		JPanel myPanel = (JPanel)jf.getContentPane();		//把我的面板设置为内容面板
		myPanel.setOpaque(false);					//把我的面板设置为不可视
		myPanel.setLayout(null);		//把我的面板设置为绝对布局
		jf.getLayeredPane().setLayout(null);		//把分层面板的布局置空
		button1.setBounds(1000,500, 300, 100);
		int x=300;
	    for(int i=0;i<3;i++) {
	    	b[i].setBounds(x, 20, 100, 180);
	    	ImageIcon icon1=new ImageIcon(this.getClass().getResource("/纸牌/"+str[i]+".png"));
	    	b[i].setIcon(icon1);
	    	x=x+110;
	    	myPanel.add(b[i]);
	    }
	     x=300;
	    for(int i=3;i<8;i++) {
	    	b[i].setBounds(x, 250, 100, 180);
	    	ImageIcon icon1=new ImageIcon(this.getClass().getResource("/纸牌/"+str[i]+".png"));
	    	b[i].setIcon(icon1);
	    	x=x+110;
	    	myPanel.add(b[i]);
	    }
	    x=300;
	    for(int i=8;i<13;i++) {
	    	b[i].setBounds(x, 480, 100, 180);
	    	ImageIcon icon1=new ImageIcon(this.getClass().getResource("/纸牌/"+str[i]+".png"));
	    	b[i].setIcon(icon1);
	    	x=x+110;
	    	myPanel.add(b[i]);
	    } 
		myPanel.add(button1);
		jf.getLayeredPane().add(label, new Integer(Integer.MIN_VALUE));		//把标签添加到分层面板的最底层
		//设置界面属性
		jf.setResizable(false);
		jf.setBounds(200, 150, background.getIconWidth(), background.getIconHeight());
		jf.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		jf.setVisible(true);
		button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根

				jf.dispose();
			}
		});
	    }
	}
class lishi extends JFrame{
	public lishi() {
		JFrame jf=new JFrame("历史记录查询");
		JLabel L1=new JLabel("page :");
		JTextField te1=new JTextField(40); 
		JLabel L2=new JLabel("limit :");
		JTextField te2=new JTextField(40); 
		JLabel L3=new JLabel("pid :");
		JTextField te3=new JTextField(40); 
		JLabel L4=new JLabel("战局ID");
		JTextField te4=new JTextField(40); 
		JButton jb1=new JButton("点击查询");
		JButton jb=new JButton("点击查询");
	    JLabel jl=new JLabel("查询历史战局                          ");
	    jl.setFont(new Font("宋体", Font.BOLD | Font.ITALIC, 20));
	    JLabel jl1=new JLabel("查询战局详情                          ");
	    jl1.setFont(new Font("宋体", Font.BOLD | Font.ITALIC, 20));
	    jb.setBackground(Color.white);
	    jb1.setBackground(Color.white);
		jf.setLayout(new FlowLayout(2, 20, 10));
		jf.add(jl);
		jf.add(L1);
		jf.add(te1);
		jf.add(L2);
		jf.add(te2);
		jf.add(L3);
		jf.add(te3);
		jf.add(jb);
		jf.add(jl1);
		jf.add(L4);
		jf.add(te4);
		jf.add(jb1);
		jf.setResizable(false);
		jf.setBounds(300, 300, 500,300);
		jf.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		jf.setVisible(true);
		jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				String page=te1.getText();
				String limit=te2.getText();
				String pid=te3.getText();
				try {
					String str=App.zhanji(page, limit, pid);
					zhanjuliebiao z=new zhanjuliebiao(str);
					z.setVisible(true);
					z.dispose();
					 
				} catch (UnirestException e1) {
					// TODO 自动生成的 catch 块
					e1.printStackTrace();
				}
			}
		});
		jb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				String id=te4.getText();
				String str;
				try {
					str = App.xiangqing(id);
					xqing x=new xqing(str);
					x.setVisible(true);
					x.dispose();
				} catch (UnirestException e1) {
					// TODO 自动生成的 catch 块
					e1.printStackTrace();
				}
				
			}
		});
	}
}
class zhanjuliebiao extends JFrame{
	public zhanjuliebiao(String str) {
		 
		 JSONObject jsonobj=JSONObject.fromObject(str);
		 JSONArray json  = jsonobj.getJSONArray("data");//获取数组 
		int x=json.size();
		JFrame f = new JFrame("战局列表");
        f.setSize(500, 400);
        f.setLocation(300, 300); 
        f.setLayout(new BorderLayout());
        Vector<String>lie=new Vector<>();
        lie.add("顺序");
        lie.add("card");
        lie.add("id");
        lie.add("score");
        lie.add("timestamp");
        
        Vector<Vector<String>>shuju=new Vector<>();
        for(int i=0;i<x;i++) {
        	Vector<String>row=new Vector<>();
        	row.add(String.valueOf(i+1));
        	row.add(json.getJSONObject(i).get("card").toString());
        	row.add(json.getJSONObject(i).get("id").toString());
        	row.add(json.getJSONObject(i).get("score").toString());
        	row.add(json.getJSONObject(i).get("timestamp").toString());
        	shuju.add(row);
        }
        JTable t = new JTable(shuju,lie);
        FitTableColumns(t);
        final JScrollPane sp = new JScrollPane(t);
        f.getContentPane().add(sp,BorderLayout.CENTER);
        JTableHeader th=t.getTableHeader();
        f.getContentPane().add(th,BorderLayout.NORTH);
        f.add(sp);
        f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        f.setVisible(true);
	}
	public void FitTableColumns(JTable myTable){
		  JTableHeader header = myTable.getTableHeader();
		     int rowCount = myTable.getRowCount();

		     Enumeration columns = myTable.getColumnModel().getColumns();
		     while(columns.hasMoreElements()){
		         TableColumn column = (TableColumn)columns.nextElement();
		         int col = header.getColumnModel().getColumnIndex(column.getIdentifier());
		         int width = (int)myTable.getTableHeader().getDefaultRenderer()
		                 .getTableCellRendererComponent(myTable, column.getIdentifier()
		                         , false, false, -1, col).getPreferredSize().getWidth();
		         for(int row = 0; row<rowCount; row++){
		             int preferedWidth = (int)myTable.getCellRenderer(row, col).getTableCellRendererComponent(myTable,
		               myTable.getValueAt(row, col), false, false, row, col).getPreferredSize().getWidth();
		             width = Math.max(width, preferedWidth);
		         }
		         header.setResizingColumn(column); // 此行很重要
		         column.setWidth(width+myTable.getIntercellSpacing().width);
		     }

}
}
class xqing extends JFrame{
	public xqing(String str) {
		 
		int st=str.indexOf("\"detail");
		 int sr=str.lastIndexOf("]");
		 String s="{"+str.substring(st,sr+1)+"}";
		 JSONArray json = null;
		 JSONObject jsonobj=JSONObject.fromObject(s);
		 json = jsonobj.getJSONArray("detail");//获取数组
		 int x=json.size();
		JFrame f = new JFrame("战局详情");
       f.setSize(500, 400);
       f.setLocation(300, 300); 
       f.setLayout(new BorderLayout());
       Vector<String>lie=new Vector<>();
       lie.add("player_id");
       lie.add("name");
       lie.add("score");
       lie.add("card");
       
       Vector<Vector<String>>shuju=new Vector<>();
       for(int i=0;i<x;i++) {
       	Vector<String>row=new Vector<>();
       	row.add(json.getJSONObject(i).get("player_id").toString());
       	row.add(json.getJSONObject(i).get("name").toString()); 
       	row.add(json.getJSONObject(i).get("score").toString());
       	row.add(json.getJSONObject(i).get("card").toString());
       	shuju.add(row);
       }
       JTable t = new JTable(shuju,lie);
       FitTableColumns(t);
       final JScrollPane sp = new JScrollPane(t);
       f.getContentPane().add(sp,BorderLayout.CENTER);
       JTableHeader th=t.getTableHeader();
       f.getContentPane().add(th,BorderLayout.NORTH);
       f.add(sp);
       f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
       f.setVisible(true);
	}
	public void FitTableColumns(JTable myTable){
		  JTableHeader header = myTable.getTableHeader();
		     int rowCount = myTable.getRowCount();

		     Enumeration columns = myTable.getColumnModel().getColumns();
		     while(columns.hasMoreElements()){
		         TableColumn column = (TableColumn)columns.nextElement();
		         int col = header.getColumnModel().getColumnIndex(column.getIdentifier());
		         int width = (int)myTable.getTableHeader().getDefaultRenderer()
		                 .getTableCellRendererComponent(myTable, column.getIdentifier()
		                         , false, false, -1, col).getPreferredSize().getWidth();
		         for(int row = 0; row<rowCount; row++){
		             int preferedWidth = (int)myTable.getCellRenderer(row, col).getTableCellRendererComponent(myTable,
		               myTable.getValueAt(row, col), false, false, row, col).getPreferredSize().getWidth();
		             width = Math.max(width, preferedWidth);
		         }
		         header.setResizingColumn(column); // 此行很重要
		         column.setWidth(width+myTable.getIntercellSpacing().width);
		     }

}
}
public class LoginGUI extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = -271186866626797931L;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new LoginGUI();
	}
	public  LoginGUI()
	{
		JFrame jf=new JFrame();
		JButton button = new JButton("登录");   //创建一个按钮
		JButton button1 = new JButton("注册");
		JLabel L1=new JLabel("账号:");
		JTextField te1=new JTextField(30);        //账号输入框 括号内是输入框长度
		JLabel L2=new JLabel("密码:");
		JPasswordField te2=new JPasswordField(30);//   PasswordField 的使用  密码输入框
		te2.setEchoChar('*');
		JLabel L3=new JLabel("登录失败");
		ImageIcon background = new ImageIcon(this.getClass().getResource("/jpg/backgroud.jpg"));	//创建一个背景图片"src/main/java/jpg/backgroud.jpg"
		JLabel label = new JLabel(background);		//把背景图片添加到标签里
		label.setBounds(0, 0, background.getIconWidth(), background.getIconHeight());	//把标签设置为和图片等高等宽
		JPanel myPanel = (JPanel)jf.getContentPane();		//把我的面板设置为内容面板
		myPanel.setOpaque(false);					//把我的面板设置为不可视
		myPanel.setLayout(null);		//把我的面板设置为绝对布局
		jf.getLayeredPane().setLayout(null);		//把分层面板的布局置空
		L1.setBounds(190, 160, 200, 30);
		L2.setBounds(190, 200,200, 30);
		te1.setBounds(250, 165, 200, 20);
		te2.setBounds(250, 205, 200, 20);
		button.setBounds(250, 250, 100, 20);
		button1.setBounds(350,250, 100, 20);
		myPanel.add(L1);
		myPanel.add(te1);
		myPanel.add(L2);
		myPanel.add(te2);
		myPanel.add(button1);
		myPanel.add(button);
		myPanel.add(L3);
		jf.getLayeredPane().add(label, new Integer(Integer.MIN_VALUE));		//把标签添加到分层面板的最底层
		//设置界面属性
//		jf.setResizable(false);
		jf.setTitle("登录界面");
		jf.setBounds(300, 300, background.getIconWidth(), background.getIconHeight());
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
		button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				register r=new register();
				r.setVisible(true);
				r.dispose();
			}
		});
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				String username=te1.getText().toString();
				String password=te2.getText().toString();
				try {
					if(App.dengru(username, password)==1) {
					MainGUI m=new MainGUI();
					m.setVisible(true);
					m.dispose();
					
					L3.setText("登录成功");
					L3.setSize(background.getIconWidth(), background.getIconHeight());
					L3.setFont(new Font("宋体", Font.BOLD | Font.ITALIC, 30));
					jf.dispose();
					}else {
						L3.setText("登录失败");
						L3.setSize(background.getIconWidth(), background.getIconHeight());
						L3.setFont(new Font("宋体", Font.BOLD | Font.ITALIC, 30));
					}
				} catch (UnirestException e1) {
					// TODO 自动生成的 catch 块
					e1.printStackTrace();
				}
			}
		});
		}
}


