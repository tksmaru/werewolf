package org.tksmaru.werewolf.model;

import java.io.Serializable;
import java.util.Date;

public class Profile implements Serializable {

	private static final long serialVersionUID = 3350187655069475164L;

	private String amebaId;
	private String nickname;
	private byte sex;
	private String sexText;
	private Date birthday;
	private String birthdayText;
	private byte bloodtype;
	private String bloodtypeText;
	private String livingRegion;
	private String freeText;
	private String mainPictureUrl;
	private String mainPictureTitle;
	private int mainPictureHeight;
	private int mainPictureWidth;
	private String mainThumbnailPictureUrl;
	private int mainThumbnailPictureHeight;
	private int mainThumbnailPictureWidth;

	public Profile() {
	}

	public String getAmebaId() {
		return amebaId;
	}

	public void setAmebaId(String amebaId) {
		this.amebaId = amebaId;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public byte getSex() {
		return sex;
	}

	public void setSex(byte sex) {
		this.sex = sex;
	}

	public String getSexText() {
		return sexText;
	}

	public void setSexText(String sexText) {
		this.sexText = sexText;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getBirthdayText() {
		return birthdayText;
	}

	public void setBirthdayText(String birthdayText) {
		this.birthdayText = birthdayText;
	}

	public byte getBloodtype() {
		return bloodtype;
	}

	public void setBloodtype(byte bloodtype) {
		this.bloodtype = bloodtype;
	}

	public String getBloodtypeText() {
		return bloodtypeText;
	}

	public void setBloodtypeText(String bloodtypeText) {
		this.bloodtypeText = bloodtypeText;
	}

	public String getLivingRegion() {
		return livingRegion;
	}

	public void setLivingRegion(String livingRegion) {
		this.livingRegion = livingRegion;
	}

	public String getFreeText() {
		return freeText;
	}

	public void setFreeText(String freeText) {
		this.freeText = freeText;
	}

	public String getMainPictureUrl() {
		return mainPictureUrl;
	}

	public void setMainPictureUrl(String mainPictureUrl) {
		this.mainPictureUrl = mainPictureUrl;
	}

	public String getMainPictureTitle() {
		return mainPictureTitle;
	}

	public void setMainPictureTitle(String mainPictureTitle) {
		this.mainPictureTitle = mainPictureTitle;
	}

	public int getMainPictureHeight() {
		return mainPictureHeight;
	}

	public void setMainPictureHeight(int mainPictureHeight) {
		this.mainPictureHeight = mainPictureHeight;
	}

	public int getMainPictureWidth() {
		return mainPictureWidth;
	}

	public void setMainPictureWidth(int mainPictureWidth) {
		this.mainPictureWidth = mainPictureWidth;
	}

	public String getMainThumbnailPictureUrl() {
		return mainThumbnailPictureUrl;
	}

	public void setMainThumbnailPictureUrl(String mainThumbnailPictureUrl) {
		this.mainThumbnailPictureUrl = mainThumbnailPictureUrl;
	}

	public int getMainThumbnailPictureHeight() {
		return mainThumbnailPictureHeight;
	}

	public void setMainThumbnailPictureHeight(int mainThumbnailPictureHeight) {
		this.mainThumbnailPictureHeight = mainThumbnailPictureHeight;
	}

	public int getMainThumbnailPictureWidth() {
		return mainThumbnailPictureWidth;
	}

	public void setMainThumbnailPictureWidth(int mainThumbnailPictureWidth) {
		this.mainThumbnailPictureWidth = mainThumbnailPictureWidth;
	}

}
