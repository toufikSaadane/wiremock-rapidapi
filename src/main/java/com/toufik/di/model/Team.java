
package com.toufik.di.model;

import lombok.Data;

@Data
public class Team {

    private String mAbbreviation;
    private Boolean mActive;
    private Conference mConference;
    private Division mDivision;
    private String mFirstYearOfPlay;
    private Franchise mFranchise;
    private Long mFranchiseId;
    private Long mId;
    private String mLink;
    private String mLocationName;
    private String mName;
    private String mOfficialSiteUrl;
    private String mShortName;
    private String mTeamName;
    private Venue mVenue;
}
