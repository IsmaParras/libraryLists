package org.iesfm.ismaparras.library;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Objects;

public class Member {
    private final static Logger log = LoggerFactory.getLogger(Member.class);

    private String nif;
    private String name;
    private String surnames;
    private int memberNumber;
    private int zipCode;

    public Member(String nif, String name, String surnames, int memberNumber, int zipCode) {
        this.nif = nif;
        this.name = name;
        this.surnames = surnames;
        this.memberNumber = memberNumber;
        this.zipCode = zipCode;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurnames() {
        return surnames;
    }

    public void setSurnames(String surnames) {
        this.surnames = surnames;
    }

    public int getMemberNumber() {
        return memberNumber;
    }

    public void setMemberNumber(int memberNumber) {
        this.memberNumber = memberNumber;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return memberNumber == member.memberNumber && zipCode == member.zipCode && Objects.equals(nif, member.nif) && Objects.equals(name, member.name) && Objects.equals(surnames, member.surnames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nif, name, surnames, memberNumber, zipCode);
    }

    @Override
    public String toString() {
        return "Member{" +
                "nif='" + nif + '\'' +
                ", name='" + name + '\'' +
                ", surnames='" + surnames + '\'' +
                ", memberNumber=" + memberNumber +
                ", zipCode=" + zipCode +
                '}';
    }
}
