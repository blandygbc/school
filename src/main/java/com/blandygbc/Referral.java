package com.blandygbc;

import java.time.LocalDateTime;

public class Referral {
    private Student referredStudent;
    private Student referringStudent;
    private LocalDateTime referralDate;

    public Referral(Student referredStudent, Student referringStudent) {
        this.referredStudent = referredStudent;
        this.referringStudent = referringStudent;
        this.referralDate = LocalDateTime.now();
    }

    public Student getReferredStudent() {
        return referredStudent;
    }

    public Student getReferringStudent() {
        return referringStudent;
    }

    public LocalDateTime getReferralDate() {
        return referralDate;
    }
}
