package b.initAndClear;

public class Chair {
	static boolean gcrun = false;//�����ռ����Ƿ��Ѿ���ʼ����
	static boolean f = false;//Chair�ɸ���main()��Ӧֹͣ���������
	static int created = 0;
	static int finalized = 0;
	int i;

	Chair() {
		i = ++created;
		if (created == 47)
			System.out.println("Created 47");
	}

	protected void finalize() {
		//�����˶��ٸ����󣬾ͻ�ִ�м��Σ�˵���ڷ����������պ�ÿ�����󶼻�ִ��finalize������Ϊ�˵��Է��㽫��ע��
//		System.out.println("1111");
		if (!gcrun) {
			gcrun = true;
			//��Chair��ʼ��created�κ󣬷�����������
			System.out.println("Beginning to finalize after " + created + " Chairs have been created");
		}
		if (i == 47) {
			System.out.println("Finalizing Chair #47, " + "Setting flag to stop Chair creation");
			f = true;
		}
		finalized++;
		if (finalized >= created)
			System.out.println("All " + finalized + " finalized");
	}
}
