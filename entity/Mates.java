package jp.co.sss.psychology.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "mates")
public class Mates {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_mates")
	@SequenceGenerator(name = "seq_mates_gen", sequenceName = "seq_mates", allocationSize = 1)
	private Integer id;

	@Column
	private String name;

	@Column
	private int ans1;

	@Column
	private int ans2;

	@Column
	private int ans3;

	@Column
	private int ans4;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAns1() {
		return ans1;
	}

	public void setAns1(int ans1) {
		this.ans1 = ans1;
	}

	public int getAns2() {
		return ans2;
	}

	public void setAns2(int ans2) {
		this.ans2 = ans2;
	}

	public int getAns3() {
		return ans3;
	}

	public void setAns3(int ans3) {
		this.ans3 = ans3;
	}

	public int getAns4() {
		return ans4;
	}

	public void setAns4(int ans4) {
		this.ans4 = ans4;
	}

	
}
