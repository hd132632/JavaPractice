package org.dimigo.thread;

public class Runner extends Thread{
	private String name;
	
	public Runner()
	{
		
	}
	public Runner(String name)
	{
		this.name = name;
	}
	public void run()
	{
		for(int i = 0;i<12;i++)
		{
			if(i==0)
			{
				System.out.println(name + "출발");
			}else
			{
			System.out.println(name + (100 - ((i-1)*10)) + "미터");
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(name + "골인");
		
	}

}
