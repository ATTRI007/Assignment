package Opps;
class  Database  {


	private static Database dbobject;

	private Database() {

	}


	public static Database getInstance() {

		if(dbobject == null)
		{
			dbobject = new Database();
		}

		System.out.println(dbobject);

		return dbobject;


	}

	public void getmsg()
	{
		System.out.println("Your are good");


	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Database db1;



		db1 = Database.getInstance();

		System.out.println(db1);

		db1.getmsg();
	}
	}


