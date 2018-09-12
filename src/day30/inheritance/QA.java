package day30.inheritance;

class QA {

	public void performWork(ManualTesting mt) {
		System.out.println("Manual testing is being performed");
	}

	public void performWork(ManualTesting mt, Automation a) {
		System.out.println("Manual and Automation both are performed together");
	}

	public static void main(String[] args) {
		QA q = new QA();
		q.performWork(new ManualTesting(), new Automation());
		q.performWork(new ManualTesting());
	}
}