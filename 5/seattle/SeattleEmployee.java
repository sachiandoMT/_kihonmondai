package seattle;

public class SeattleEmployee extends SeattleSSEmployee{

   	//社員氏名
    	private String empName;
	
   	//社員氏名を取得する
	public String getEmpName() {
        		return empName;
    	}

   	//社員氏名をセットする
    	public void setEmpName(String empName) {
       		this.empName = empName;
    	}
	
   	//所属部署を取得する
    	public String getDept(){
        		return "無所属";
    	}
}