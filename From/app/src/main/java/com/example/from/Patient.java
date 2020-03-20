package com.example.from;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Date;
import java.util.HashMap;

public class Patient{

    String name,occupation, address, telephone,gender, dateOfBirth, occlusionType,biteType, lipLineType;
    String surgeriesPast5Years, complaintPatientWords, medLineDevOpening,mouthOpening,symmetryOfTheFace, lateralMandibularMove,musclesOfMastication, lymphNodes;
    String toothLossCauses, mucosaInEdentulousArea, tongue, badHabits, oralHygiene;
    String extraOralXrays, intraOralXrays;
    String fullTreatmentPlan, upperRightQuadrant,upperLeftQuadrant,lowerRightQuadrant,lowerLeftQuadrant;

    HashMap<String, Boolean> med_history = new HashMap();
    HashMap<String, Boolean> sounds = new HashMap();

    public Patient(String name, String occupation, String address, String telephone, String gender, String dateOfBirth, String occlusionType, String biteType, String lipLineType, String surgeriesPast5Years, String complaintPatientWords, String medLineDevOpening, String mouthOpening, String symmetryOfTheFace, String lateralMandibularMove, String musclesOfMastication, String lymphNodes, String toothLossCauses, String mucosaInEdentulousArea, String tongue, String badHabits, String oralHygiene, String extraOralXrays, String intraOralXrays, String fullTreatmentPlan, String upperRightQuadrant, String upperLeftQuadrant, String lowerRightQuadrant, String lowerLeftQuadrant, HashMap<String, Boolean> med_history, HashMap<String, Boolean> sounds) {
        this.name = name;
        this.occupation = occupation;
        this.address = address;
        this.telephone = telephone;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.occlusionType = occlusionType;
        this.biteType = biteType;
        this.lipLineType = lipLineType;
        this.surgeriesPast5Years = surgeriesPast5Years;
        this.complaintPatientWords = complaintPatientWords;
        this.medLineDevOpening = medLineDevOpening;
        this.mouthOpening = mouthOpening;
        this.symmetryOfTheFace = symmetryOfTheFace;
        this.lateralMandibularMove = lateralMandibularMove;
        this.musclesOfMastication = musclesOfMastication;
        this.lymphNodes = lymphNodes;
        this.toothLossCauses = toothLossCauses;
        this.mucosaInEdentulousArea = mucosaInEdentulousArea;
        this.tongue = tongue;
        this.badHabits = badHabits;
        this.oralHygiene = oralHygiene;
        this.extraOralXrays = extraOralXrays;
        this.intraOralXrays = intraOralXrays;
        this.fullTreatmentPlan = fullTreatmentPlan;
        this.upperRightQuadrant = upperRightQuadrant;
        this.upperLeftQuadrant = upperLeftQuadrant;
        this.lowerRightQuadrant = lowerRightQuadrant;
        this.lowerLeftQuadrant = lowerLeftQuadrant;
        this.med_history = med_history;
        this.sounds = sounds;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getOcclusionType() {
        return occlusionType;
    }

    public void setOcclusionType(String occlusionType) {
        this.occlusionType = occlusionType;
    }

    public String getLipLineType() {
        return lipLineType;
    }

    public void setLipLineType(String lipLineType) {
        this.lipLineType = lipLineType;
    }

    public String getSurgeriesPast5Years() {
        return surgeriesPast5Years;
    }

    public void setSurgeriesPast5Years(String surgeriesPast5Years) {
        this.surgeriesPast5Years = surgeriesPast5Years;
    }

    public String getComplaintPatientWords() {
        return complaintPatientWords;
    }

    public void setComplaintPatientWords(String complaintPatientWords) {
        this.complaintPatientWords = complaintPatientWords;
    }

    public String getMedLineDevOpening() {
        return medLineDevOpening;
    }

    public void setMedLineDevOpening(String medLineDevOpening) {
        this.medLineDevOpening = medLineDevOpening;
    }

    public String getMouthOpening() {
        return mouthOpening;
    }

    public void setMouthOpening(String mouthOpening) {
        this.mouthOpening = mouthOpening;
    }

    public String getSymmetryOfTheFace() {
        return symmetryOfTheFace;
    }

    public void setSymmetryOfTheFace(String symmetryOfTheFace) {
        this.symmetryOfTheFace = symmetryOfTheFace;
    }

    public String getLateralMandibularMove() {
        return lateralMandibularMove;
    }

    public void setLateralMandibularMove(String lateralMandibularMove) {
        this.lateralMandibularMove = lateralMandibularMove;
    }

    public String getMusclesOfMastication() {
        return musclesOfMastication;
    }

    public void setMusclesOfMastication(String musclesOfMastication) {
        this.musclesOfMastication = musclesOfMastication;
    }

    public String getLymphNodes() {
        return lymphNodes;
    }

    public void setLymphNodes(String lymphNodes) {
        this.lymphNodes = lymphNodes;
    }

    public String getToothLossCauses() {
        return toothLossCauses;
    }

    public void setToothLossCauses(String toothLossCauses) {
        this.toothLossCauses = toothLossCauses;
    }

    public String getMucosaInEdentulousArea() {
        return mucosaInEdentulousArea;
    }

    public void setMucosaInEdentulousArea(String mucosaInEdentulousArea) {
        this.mucosaInEdentulousArea = mucosaInEdentulousArea;
    }

    public String getTongue() {
        return tongue;
    }

    public void setTongue(String tongue) {
        this.tongue = tongue;
    }

    public String getBadHabits() {
        return badHabits;
    }

    public void setBadHabits(String badHabits) {
        this.badHabits = badHabits;
    }

    public String getOralHygiene() {
        return oralHygiene;
    }

    public void setOralHygiene(String oralHygiene) {
        this.oralHygiene = oralHygiene;
    }

    public String getExtraOralXrays() {
        return extraOralXrays;
    }

    public void setExtraOralXrays(String extraOralXrays) {
        this.extraOralXrays = extraOralXrays;
    }

    public String getIntraOralXrays() {
        return intraOralXrays;
    }

    public void setIntraOralXrays(String intraOralXrays) {
        this.intraOralXrays = intraOralXrays;
    }

    public String getFullTreatmentPlan() {
        return fullTreatmentPlan;
    }

    public void setFullTreatmentPlan(String fullTreatmentPlan) {
        this.fullTreatmentPlan = fullTreatmentPlan;
    }

    public String getUpperRightQuadrant() {
        return upperRightQuadrant;
    }

    public void setUpperRightQuadrant(String upperRightQuadrant) {
        this.upperRightQuadrant = upperRightQuadrant;
    }

    public String getUpperLeftQuadrant() {
        return upperLeftQuadrant;
    }

    public void setUpperLeftQuadrant(String upperLeftQuadrant) {
        this.upperLeftQuadrant = upperLeftQuadrant;
    }

    public String getLowerRightQuadrant() {
        return lowerRightQuadrant;
    }

    public void setLowerRightQuadrant(String lowerRightQuadrant) {
        this.lowerRightQuadrant = lowerRightQuadrant;
    }

    public String getLowerLeftQuadrant() {
        return lowerLeftQuadrant;
    }

    public void setLowerLeftQuadrant(String lowerLeftQuadrant) {
        this.lowerLeftQuadrant = lowerLeftQuadrant;
    }

    public HashMap<String, Boolean> getMed_history() {
        return med_history;
    }

    public void setMed_history(HashMap<String, Boolean> med_history) {
        this.med_history = med_history;
    }

    public HashMap<String, Boolean> getSounds() {
        return sounds;
    }

    public void setSounds(HashMap<String, Boolean> sounds) {
        this.sounds = sounds;
    }
}
