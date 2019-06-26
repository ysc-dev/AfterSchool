package com.ysc.after.school.domain.db;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.ysc.after.school.domain.Domain;

import lombok.Data;

/**
 * 학생 관리 도메인
 * 
 * @author hgko
 *
 */
@Entity
@Table(name = "tb_student")
@Data
public class Student implements Domain {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	/** 이름 */
	@Column(nullable = false, length = 20)
	private String name;
	
	/** 소속(학교 명) */
	@Column(nullable = false, length = 45)
	private String school;
	
	/** 학년 */
	private int grade;
	
	/** 학급(반) */
	private int classType;
	
	/** 번호 */
	private int number;
	
	/** 연락처 */
	@Column(length = 20)
	private String tel;
	
	private boolean agree;
	
	/** 주민등록번호 */
	@Column(length = 15)
	private String residentNumber;
	
	@Transient
	private String service;
	
	@Transient
	private String jumin1;
	
	@Transient
	private String jumin2;
	
	/** 등록시간 */
	@CreationTimestamp
	private LocalDateTime createDate;
	
	@UpdateTimestamp
	private LocalDateTime updateDate;
}
