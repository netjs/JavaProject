package basics.conditions;

public class SwitchCaseString {
	// Return the dept code for the passes department name
	public static void main(String[] args) {
		String departmentName = "Accounts";
		String deptCode = getDepartmentCode(departmentName);
		System.out.println("Department Code: " + deptCode);
	}
	
	public static String getDepartmentCode(String deptName) {
		String deptCd = "";
		switch(deptName) {
			case "Human Resources":
				deptCd = "hr";
				break;
			case "Accounts":
				deptCd = "acct";
				break;
			case "Administration":
				deptCd = "admin";
				break;
		}
		return deptCd;
		
	}

}
