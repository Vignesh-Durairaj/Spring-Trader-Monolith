package io.pivotal.springtrader.domain;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

/**
 * Represents the account.
 * <p>
 * Entity object that represents a user account.
 *
 * @author David Ferreira Pinto
 */
@Entity
@Table(name = "ACCOUNT")
public class Account implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = -3057275461420965784L;

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column(name = "id")
    private Integer id;

    @Column(name = "address", length = 250)
    private String address;

    @Column(name = "passwd", length = 250)
    private String passwd;

    @Column(name = "userid", length = 250, unique = true)
    @NotNull
    private String userid;

    @Column(name = "email", length = 250)
    private String email;

    @Column(name = "creditcard", length = 250)
    private String creditcard;

    @Column(name = "fullname", length = 250)
    private String fullname;

    @Column(name = "authtoken", length = 100)
    private String authtoken;

    @Column(name = "creationdate")
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "LL")
    private Date creationdate;

    @Column(name = "openbalance", precision = 14, scale = 2)
    private BigDecimal openbalance;

    @Column(name = "logoutcount")
    @NotNull
    private Integer logoutcount;

    @Column(name = "balance", precision = 14, scale = 2)
    private BigDecimal balance;

    @Column(name = "lastlogin")
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "LL")
    private Date lastlogin;

    @Column(name = "logincount")
    @NotNull
    private Integer logincount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCreditcard() {
        return creditcard;
    }

    public void setCreditcard(String creditcard) {
        this.creditcard = creditcard;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public Date getCreationdate() {
        return creationdate;
    }

    public void setCreationdate(Date creationdate) {
        this.creationdate = creationdate;
    }

    public BigDecimal getOpenbalance() {
        return openbalance;
    }

    public void setOpenbalance(BigDecimal openbalance) {
        this.openbalance = openbalance;
    }

    public Integer getLogoutcount() {
        return logoutcount;
    }

    public void setLogoutcount(Integer logoutcount) {
        this.logoutcount = logoutcount;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public Date getLastlogin() {
        return lastlogin;
    }

    public void setLastlogin(Date lastlogin) {
        this.lastlogin = lastlogin;
    }

    public Integer getLogincount() {
        return logincount;
    }

    public void setLogincount(Integer logincount) {
        this.logincount = logincount;
    }

    public String getAuthtoken() {
        return authtoken;
    }

    public void setAuthtoken(String authtoken) {
        this.authtoken = authtoken;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", userid='" + userid + '\'' +
                ", email='" + email + '\'' +
                ", creditcard='" + creditcard + '\'' +
                ", fullname='" + fullname + '\'' +
                ", creationdate=" + creationdate +
                ", openbalance=" + openbalance +
                ", logoutcount=" + logoutcount +
                ", balance=" + balance +
                ", lastlogin=" + lastlogin +
                ", logincount=" + logincount +
                '}';
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }

        if (that == null || getClass() != that.getClass()) {
            return false;
        }

        return Objects.equals(this.userid, ((Account) that).userid);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(userid);
    }
}
