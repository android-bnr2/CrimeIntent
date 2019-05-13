package com.bignerdranch.android.criminalintent;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CrimeLab {

    private static CrimeLab sCrimeLab;

    private List<Crime> mCrimes;


    public static CrimeLab get(Context context) {
        if (sCrimeLab == null) {
            sCrimeLab = new CrimeLab(context);
        }
        return sCrimeLab;
    }

    private CrimeLab(Context context) {
        mCrimes = new ArrayList<>();

//        for (int i = 0; i < 100; i++) {
//            Crime crime = new Crime();
//            crime.setTitle("범죄 #" + i);
//            crime.setSolved(i % 2 == 0);
//            mCrimes.add(crime);
//        }

    }

    public void addCrime(Crime c) {
        mCrimes.add(c);
    }

    public List<Crime> getCrimes() {
        return mCrimes;
    }

    public Crime getCrime(UUID id) {
        for (Crime crime : mCrimes) {
            if (crime.getId().equals(id)) {
                return crime;
            }
        }
        return  null;
    }

    public boolean removeCrime(Crime c) {

        return mCrimes.remove(c);
    }

}
