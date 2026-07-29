package basics.conditions;

public class SwitchExpressionReturn {

	public static void main(String[] args) {
		String departmentName = "Accounts";
		String deptCode = getDepartmentCode(departmentName);
		System.out.println("Department Code: " + deptCode);

	}
	public static String getDepartmentCode(String deptName) {
		 
		return  switch(deptName) {
			case "Human Resources" -> {
				System.out.println("For department name " + deptName);
				yield "hr";
			}
			case "Accounts" -> {
				System.out.println("For department name " + deptName);
				yield "acct";
			}
			case "Administration" -> "admin";
			default -> "wrong department name";
		};
		//return deptCd;
		
	}

}
