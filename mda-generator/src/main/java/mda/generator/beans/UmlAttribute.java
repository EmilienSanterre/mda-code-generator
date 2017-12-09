package mda.generator.beans;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.text.WordUtils;

/**
 * Attribut d'une classe
 * @author Fabien
 *
 */
public class UmlAttribute {
	private boolean isPK;
	private String name;
	private String camelCaseName;
	private UmlDomain domain;
	private String comment;
	private Boolean isNotNull;

	/**
	 * @return the isPK
	 */
	public boolean isPK() {
		return isPK;
	}

	/**
	 * @param isPK the isPK to set
	 */
	public void setPK(boolean isPK) {
		this.isPK = isPK;
	}

	/**
	 * @return the name
	 */
	public String getCamelCaseName() {
		return camelCaseName;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
		this.camelCaseName =  WordUtils.uncapitalize(StringUtils.remove(WordUtils.capitalizeFully(name, '_'), "_"));
	}
	
	/**
	 * @return the rawName
	 */
	public String getName() {
		return name;
	}
	
	
	/**
	 * @return the domain
	 */
	public UmlDomain getDomain() {
		return domain;
	}
	/**
	 * @param domain the domain to set
	 */
	public void setDomain(UmlDomain domain) {
		this.domain = domain;
	}
	/**
	 * @return the isNotNull
	 */
	public Boolean getIsNotNull() {
		return isNotNull;
	}
	/**
	 * @param isNotNull the isNotNull to set
	 */
	public void setIsNotNull(Boolean isNotNull) {
		this.isNotNull = isNotNull;
	}
	
	/**
	 * @return the comment
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * @param comment the comment to set
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public String toString() {
		return camelCaseName + " => " + name + " " + (isPK?"(PK)":"") + " " +domain.getName()+" " + (isNotNull?"not null":"nullable");
	}
}