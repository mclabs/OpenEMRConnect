/* ***** BEGIN LICENSE BLOCK *****
 * Version: MPL 1.1
 *
 * The contents of this file are subject to the Mozilla Public License Version
 * 1.1 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * http://www.mozilla.org/MPL/
 *
 * Software distributed under the License is distributed on an "AS IS" basis,
 * WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
 * for the specific language governing rights and limitations under the
 * License.
 *
 * The Original Code is OpenEMRConnect.
 *
 * The Initial Developer of the Original Code is International Training &
 * Education Center for Health (I-TECH) <http://www.go2itech.org/>
 *
 * Portions created by the Initial Developer are Copyright (C) 2011
 * the Initial Developer. All Rights Reserved.
 *
 * Contributor(s):
 *
 * ***** END LICENSE BLOCK ***** */
package ke.go.moh.oec;

import java.util.Date;
import java.util.List;

/**
 * Describe a person with respect to a person index. This may be a person
 * who is already in a person index, a person who is to be added to a
 * person index, or a person who is to be searched for in a person index.
 *
 * @author Jim Grace
 */
public class Person {

    /**
     * A Globally Unique IDentifier (GUID) for this person, as stored in the
     * person index being referenced.
     */
    private String personGuid;
    /** A person's first (or given) name. */
    private String firstName;
    /** A person's middle (Luo: juok) name. */
    private String middleName;
    /** A person's last (or family) name. */
    private String lastName;
    /** Any other name by which a person is commonly known. */
    private String otherName;
    /** The name of the clan to which a person belongs. */
    private String clanName;
    /** The person's gender: M or F. */
    private String sex;
    /** The person's date of birth. */
    private Date birthdate;
    /** The first (or given) name of the person's mother. */
    private String mothersFirstName;
    /** The middle (Luo: juok) name of the person's mother. */
    private String mothersMiddleName;
    /** The last (or family) name of the person's mother. */
    private String mothersLastName;
    /** The first (or given) name of the person's father. */
    private String fathersFirstName;
    /** The middle (Luo: juok) name of the person's father. */
    private String fathersMiddleName;
    /** The last (or family) name of the person's father. */
    private String fathersLastName;
    /** The first (or given) name of the head of the person's compound. */
    private String compoundHeadFirstName;
    /** The middle (Luo: juok) name of the head of the person's compound. */
    private String compoundHeadMiddleName;
    /** The last (or family) name of the head of the person's compound. */
    private String compoundHeadLastName;
    /** The name of the village in which the person lives. */
    private String villageName;
    /**
     * The person's marital status, one of the values:
     *      Married Polygamous,
     *      Married Monogamous,
     *      Divorced,
     *      Widowed,
     *      Cohabitating,
     *      Single
     */
    private String maritalStatusType;
    /**
     * Has the person given consent to access any of their HDSS
     * data from a clinic at which they are receiving care? "Y"=Yes, they
     * have given consent, "N" = No, they have refused to give consent,
     * null = They have not been asked.
     */
    private String consentSigned;
    /** Information for the person's most recent regular clinic visit (if any) */
    private Visit lastRegularVisit;
    /** Information for the person's most recent one-off clinic visit (if any) */
    private Visit lastOneOffVisit;
    /** A list containing each {@link PersonIdentifier} assigned to this person. */
    private List<PersonIdentifier> personIdentifierList;
    /** A list containing each {@link Fingerprint} taken from this person. */
    private List<Fingerprint> fingerprintList;

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getClanName() {
        return clanName;
    }

    public void setClanName(String clanName) {
        this.clanName = clanName;
    }

    public String getCompoundHeadFirstName() {
        return compoundHeadFirstName;
    }

    public void setCompoundHeadFirstName(String compoundHeadFirstName) {
        this.compoundHeadFirstName = compoundHeadFirstName;
    }

    public String getCompoundHeadLastName() {
        return compoundHeadLastName;
    }

    public void setCompoundHeadLastName(String compoundHeadLastName) {
        this.compoundHeadLastName = compoundHeadLastName;
    }

    public String getCompoundHeadMiddleName() {
        return compoundHeadMiddleName;
    }

    public void setCompoundHeadMiddleName(String compoundHeadMiddleName) {
        this.compoundHeadMiddleName = compoundHeadMiddleName;
    }

    public String getConsentSigned() {
        return consentSigned;
    }

    public void setConsentSigned(String consentSigned) {
        this.consentSigned = consentSigned;
    }

    public String getFathersFirstName() {
        return fathersFirstName;
    }

    public void setFathersFirstName(String fathersFirstName) {
        this.fathersFirstName = fathersFirstName;
    }

    public String getFathersLastName() {
        return fathersLastName;
    }

    public void setFathersLastName(String fathersLastName) {
        this.fathersLastName = fathersLastName;
    }

    public String getFathersMiddleName() {
        return fathersMiddleName;
    }

    public void setFathersMiddleName(String fathersMiddleName) {
        this.fathersMiddleName = fathersMiddleName;
    }

    public List<Fingerprint> getFingerprintList() {
        return fingerprintList;
    }

    public void setFingerprintList(List<Fingerprint> fingerprintList) {
        this.fingerprintList = fingerprintList;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Visit getLastOneOffVisit() {
        return lastOneOffVisit;
    }

    public void setLastOneOffVisit(Visit lastOneOffVisit) {
        this.lastOneOffVisit = lastOneOffVisit;
    }

    public Visit getLastRegularVisit() {
        return lastRegularVisit;
    }

    public void setLastRegularVisit(Visit lastRegularVisit) {
        this.lastRegularVisit = lastRegularVisit;
    }

    public String getMaritalStatusType() {
        return maritalStatusType;
    }

    public void setMaritalStatusType(String maritalStatusType) {
        this.maritalStatusType = maritalStatusType;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getMothersFirstName() {
        return mothersFirstName;
    }

    public void setMothersFirstName(String mothersFirstName) {
        this.mothersFirstName = mothersFirstName;
    }

    public String getMothersLastName() {
        return mothersLastName;
    }

    public void setMothersLastName(String mothersLastName) {
        this.mothersLastName = mothersLastName;
    }

    public String getMothersMiddleName() {
        return mothersMiddleName;
    }

    public void setMothersMiddleName(String mothersMiddleName) {
        this.mothersMiddleName = mothersMiddleName;
    }

    public String getOtherName() {
        return otherName;
    }

    public void setOtherName(String otherName) {
        this.otherName = otherName;
    }

    public String getPersonGuid() {
        return personGuid;
    }

    public void setPersonGuid(String personGuid) {
        this.personGuid = personGuid;
    }

    public List<PersonIdentifier> getPersonIdentifierList() {
        return personIdentifierList;
    }

    public void setPersonIdentifierList(List<PersonIdentifier> personIdentifierList) {
        this.personIdentifierList = personIdentifierList;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getVillageName() {
        return villageName;
    }

    public void setVillageName(String villageName) {
        this.villageName = villageName;
    }

}