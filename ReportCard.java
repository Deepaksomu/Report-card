package com.example.deepak.reportcard;

/**
 * Created by Deepak on 21-01-2017.
 */

public class ReportCard {
    private int mChemistryMarks;
    private int mPhysicsMarks;
    private int mBiologyMarks;
    private int mMathsMarks;
    private int mEnglishMarks;
    private int mHistoryMarks;

    public ReportCard(int chemistryMarks, int PhysicsMarks, int BiologyMarks, int mathsMarks, int englishMarks, int historyMarks) {
        mChemistryMarks = chemistryMarks;
        mPhysicsMarks = PhysicsMarks;
        mBiologyMarks = BiologyMarks;
        mMathsMarks = mathsMarks;
        mEnglishMarks = englishMarks;
        mHistoryMarks = historyMarks;
    }

    public int getchemistryMarks() {
        return mChemistryMarks;
    }

    public void setmChemistryMarks(int chemistryMarks) {
        this.mChemistryMarks = chemistryMarks;

    }

    public int getmPhysicsMarks() {
        return mPhysicsMarks;
    }

    public void setmPhysicsMarks(int PhysicsMarks) {
        this.mPhysicsMarks = PhysicsMarks;
    }

    public int getmBiologyMarks() {
        return mBiologyMarks;
    }

    public void setmBiologyMarks(int BiologyMarks) {
        this.mBiologyMarks = BiologyMarks;

    }

    public int getmEnglishMarks() {
        return mEnglishMarks;
    }

    public void setmEnglishMarks(int englishMarks) {
        this.mEnglishMarks = englishMarks;

    }

    public int getmMathsMarks() {
        return mMathsMarks;
    }

    public void setmMathMarks(int mathsMarks) {
        this.mMathsMarks = mathsMarks;

    }

    public int getmHistoryMarks() {
        return mHistoryMarks;
    }

    public void setmHistoryMarks(int historyMarks) {
        this.mHistoryMarks = historyMarks;

    }

    @Override


    public String toString() {
        return "Result { " +
                "Physics = " + mPhysicsMarks +
                ", Chemistry = " + mChemistryMarks +
                ", History = " + mHistoryMarks +
                ", English = " + mEnglishMarks +
                ", Biology = " + mBiologyMarks +
                ", Maths= " + mMathsMarks +
                " }";
    }


}