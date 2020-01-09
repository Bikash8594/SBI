package in.nit.runner;

import java.util.Arrays;
import java.util.Properties;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("my.emp")
public class ConfigData implements CommandLineRunner {
	private int empid;
	private String empName;
	private double empSal;
	private String []proj;
	private double maoney;
	//private Properties dtls;
	@Override
	public void run(String... args) throws Exception {

		System.out.println("done");
		System.out.println(this);
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
	public String[] getProj() {
		return proj;
	}
	public void setProj(String[] proj) {
		this.proj = proj;
	}
	@Override
	public String toString() {
		return "ConfigData [empid=" + empid + ", empName=" + empName + ", empSal=" + empSal + ", proj="
				+ Arrays.toString(proj) + "]";
	}
	


}
