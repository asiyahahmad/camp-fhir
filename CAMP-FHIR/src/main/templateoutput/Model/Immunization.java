// // default package
package main.templateoutput.Model;
// Generated Nov 18, 2021, 1:47:20 PM by Hibernate Tools 5.6.1.Final



/**
 * Immunization generated by hbm2java
 */
public class Immunization  implements java.io.Serializable {


     private String immIdentifierCodingCode;
     private String immIdentifierCodingUserSelected;
     private String immIdentifierCodingVersion;
     private String immIdentifierCodingDisplay;
     private String immIdentifierCodingSystem;
     private String immStatus;
     private String immSttsRsnCdngSrSlctd;
     private String immStatusReasonCodingCode;
     private String immStatusReasonCodingVersion;
     private String immStatusReasonCodingDisplay;
     private String immStatusReasonCodingSystem;
     private String immVccnCdCdngSrSlctd;
     private String immVaccineCodeCodingCode;
     private String immVaccineCodeCodingVersion;
     private String immVaccineCodeCodingDisplay;
     private String immVaccineCodeCodingSystem;
     private String immPnt;
     private String immEncounter;
     private String immOccurrenceDatetime;
     private String immOccurrenceString;
     private String immRecorded;
     private String immPrimarySource;
     private String immRprtrgnCdngSrSlctd;
     private String immReportOriginCodingCode;
     private String immReportOriginCodingVersion;
     private String immReportOriginCodingDisplay;
     private String immReportOriginCodingSystem;
     private String immLocation;
     private String immManufacturer;
     private String immLotNumber;
     private String immExpirationDate;
     private String immSiteCodingUserSelected;
     private String immSiteCodingCode;
     private String immSiteCodingVersion;
     private String immSiteCodingDisplay;
     private String immSiteCodingSystem;
     private String immRouteCodingUserSelected;
     private String immRouteCodingCode;
     private String immRouteCodingVersion;
     private String immRouteCodingDisplay;
     private String immRouteCodingSystem;
     private String immDoseQuantity;
     private String immPerformer;
     private String immPrfrmrFnctnCdngSrSlctd;
     private String immPerformerFunctionCodingCode;
     private String immPrfrmrFnctnCdngVrsn;
     private String immPrfrmrFnctnCdngDsplay;
     private String immPrfrmrFnctnCdngSstm;
     private String immPerformerActor;
     private String immNoteCodingUserSelected;
     private String immNoteCodingCode;
     private String immNoteCodingVersion;
     private String immNoteCodingDisplay;
     private String immNoteCodingSystem;
     private String immReasonCodeCodingUserSelected;
     private String immReasonCodeCodingCode;
     private String immReasonCodeCodingVersion;
     private String immReasonCodeCodingDisplay;
     private String immReasonCodeCodingSystem;
     private String immReasonReference;
     private String immIsSubpotent;
     private String immSbptntRsnCdngSrSlctd;
     private String immSubpotentReasonCodingCode;
     private String immSubpotentReasonCodingVersion;
     private String immSubpotentReasonCodingDisplay;
     private String immSubpotentReasonCodingSystem;
     private String immEducation;
     private String immEducationDocumentType;
     private String immEducationReference;
     private String immEducationPublicationDate;
     private String immEducationPresentationDate;
     private String immPrgrmlgbltCdngSrSlctd;
     private String immProgramEligibilityCodingCode;
     private String immPrgrmlgbltCdngVrsn;
     private String immPrgrmlgbltCdngDsplay;
     private String immPrgrmlgbltCdngSstm;
     private String immFndngSrcCdngSrSlctd;
     private String immFundingSourceCodingCode;
     private String immFundingSourceCodingVersion;
     private String immFundingSourceCodingDisplay;
     private String immFundingSourceCodingSystem;
     private String immReaction;
     private String immReactionDate;
     private String immReactionDetail;
     private String immReactionReported;
     private String immProtocolApplied;
     private String immProtocolAppliedSeries;
     private String immProtocolAppliedAuthority;
     private String immPrtclppldTrgtDssCdngSrSlctd;
     private String immPrtclppldTrgtDssCdngCde;
     private String immPrtclppldTrgtDssCdngVrsn;
     private String immPrtclppldTrgtDssCdngDsplay;
     private String immPrtclppldTrgtDssCdngSstm;
     private String immPrtclppldDsNmbrPstvnt;
     private String immPrtclppldDsNmbrStrng;
     private String immPrtclppldSrsDssPstvnt;
     private String immPrtclppldSrsDssStrng;

    public Immunization() {
    }

	
    public Immunization(String immIdentifierCodingCode) {
        this.immIdentifierCodingCode = immIdentifierCodingCode;
    }
    public Immunization(String immIdentifierCodingCode, String immIdentifierCodingUserSelected, String immIdentifierCodingVersion, String immIdentifierCodingDisplay, String immIdentifierCodingSystem, String immStatus, String immSttsRsnCdngSrSlctd, String immStatusReasonCodingCode, String immStatusReasonCodingVersion, String immStatusReasonCodingDisplay, String immStatusReasonCodingSystem, String immVccnCdCdngSrSlctd, String immVaccineCodeCodingCode, String immVaccineCodeCodingVersion, String immVaccineCodeCodingDisplay, String immVaccineCodeCodingSystem, String immPnt, String immEncounter, String immOccurrenceDatetime, String immOccurrenceString, String immRecorded, String immPrimarySource, String immRprtrgnCdngSrSlctd, String immReportOriginCodingCode, String immReportOriginCodingVersion, String immReportOriginCodingDisplay, String immReportOriginCodingSystem, String immLocation, String immManufacturer, String immLotNumber, String immExpirationDate, String immSiteCodingUserSelected, String immSiteCodingCode, String immSiteCodingVersion, String immSiteCodingDisplay, String immSiteCodingSystem, String immRouteCodingUserSelected, String immRouteCodingCode, String immRouteCodingVersion, String immRouteCodingDisplay, String immRouteCodingSystem, String immDoseQuantity, String immPerformer, String immPrfrmrFnctnCdngSrSlctd, String immPerformerFunctionCodingCode, String immPrfrmrFnctnCdngVrsn, String immPrfrmrFnctnCdngDsplay, String immPrfrmrFnctnCdngSstm, String immPerformerActor, String immNoteCodingUserSelected, String immNoteCodingCode, String immNoteCodingVersion, String immNoteCodingDisplay, String immNoteCodingSystem, String immReasonCodeCodingUserSelected, String immReasonCodeCodingCode, String immReasonCodeCodingVersion, String immReasonCodeCodingDisplay, String immReasonCodeCodingSystem, String immReasonReference, String immIsSubpotent, String immSbptntRsnCdngSrSlctd, String immSubpotentReasonCodingCode, String immSubpotentReasonCodingVersion, String immSubpotentReasonCodingDisplay, String immSubpotentReasonCodingSystem, String immEducation, String immEducationDocumentType, String immEducationReference, String immEducationPublicationDate, String immEducationPresentationDate, String immPrgrmlgbltCdngSrSlctd, String immProgramEligibilityCodingCode, String immPrgrmlgbltCdngVrsn, String immPrgrmlgbltCdngDsplay, String immPrgrmlgbltCdngSstm, String immFndngSrcCdngSrSlctd, String immFundingSourceCodingCode, String immFundingSourceCodingVersion, String immFundingSourceCodingDisplay, String immFundingSourceCodingSystem, String immReaction, String immReactionDate, String immReactionDetail, String immReactionReported, String immProtocolApplied, String immProtocolAppliedSeries, String immProtocolAppliedAuthority, String immPrtclppldTrgtDssCdngSrSlctd, String immPrtclppldTrgtDssCdngCde, String immPrtclppldTrgtDssCdngVrsn, String immPrtclppldTrgtDssCdngDsplay, String immPrtclppldTrgtDssCdngSstm, String immPrtclppldDsNmbrPstvnt, String immPrtclppldDsNmbrStrng, String immPrtclppldSrsDssPstvnt, String immPrtclppldSrsDssStrng) {
       this.immIdentifierCodingCode = immIdentifierCodingCode;
       this.immIdentifierCodingUserSelected = immIdentifierCodingUserSelected;
       this.immIdentifierCodingVersion = immIdentifierCodingVersion;
       this.immIdentifierCodingDisplay = immIdentifierCodingDisplay;
       this.immIdentifierCodingSystem = immIdentifierCodingSystem;
       this.immStatus = immStatus;
       this.immSttsRsnCdngSrSlctd = immSttsRsnCdngSrSlctd;
       this.immStatusReasonCodingCode = immStatusReasonCodingCode;
       this.immStatusReasonCodingVersion = immStatusReasonCodingVersion;
       this.immStatusReasonCodingDisplay = immStatusReasonCodingDisplay;
       this.immStatusReasonCodingSystem = immStatusReasonCodingSystem;
       this.immVccnCdCdngSrSlctd = immVccnCdCdngSrSlctd;
       this.immVaccineCodeCodingCode = immVaccineCodeCodingCode;
       this.immVaccineCodeCodingVersion = immVaccineCodeCodingVersion;
       this.immVaccineCodeCodingDisplay = immVaccineCodeCodingDisplay;
       this.immVaccineCodeCodingSystem = immVaccineCodeCodingSystem;
       this.immPnt = immPnt;
       this.immEncounter = immEncounter;
       this.immOccurrenceDatetime = immOccurrenceDatetime;
       this.immOccurrenceString = immOccurrenceString;
       this.immRecorded = immRecorded;
       this.immPrimarySource = immPrimarySource;
       this.immRprtrgnCdngSrSlctd = immRprtrgnCdngSrSlctd;
       this.immReportOriginCodingCode = immReportOriginCodingCode;
       this.immReportOriginCodingVersion = immReportOriginCodingVersion;
       this.immReportOriginCodingDisplay = immReportOriginCodingDisplay;
       this.immReportOriginCodingSystem = immReportOriginCodingSystem;
       this.immLocation = immLocation;
       this.immManufacturer = immManufacturer;
       this.immLotNumber = immLotNumber;
       this.immExpirationDate = immExpirationDate;
       this.immSiteCodingUserSelected = immSiteCodingUserSelected;
       this.immSiteCodingCode = immSiteCodingCode;
       this.immSiteCodingVersion = immSiteCodingVersion;
       this.immSiteCodingDisplay = immSiteCodingDisplay;
       this.immSiteCodingSystem = immSiteCodingSystem;
       this.immRouteCodingUserSelected = immRouteCodingUserSelected;
       this.immRouteCodingCode = immRouteCodingCode;
       this.immRouteCodingVersion = immRouteCodingVersion;
       this.immRouteCodingDisplay = immRouteCodingDisplay;
       this.immRouteCodingSystem = immRouteCodingSystem;
       this.immDoseQuantity = immDoseQuantity;
       this.immPerformer = immPerformer;
       this.immPrfrmrFnctnCdngSrSlctd = immPrfrmrFnctnCdngSrSlctd;
       this.immPerformerFunctionCodingCode = immPerformerFunctionCodingCode;
       this.immPrfrmrFnctnCdngVrsn = immPrfrmrFnctnCdngVrsn;
       this.immPrfrmrFnctnCdngDsplay = immPrfrmrFnctnCdngDsplay;
       this.immPrfrmrFnctnCdngSstm = immPrfrmrFnctnCdngSstm;
       this.immPerformerActor = immPerformerActor;
       this.immNoteCodingUserSelected = immNoteCodingUserSelected;
       this.immNoteCodingCode = immNoteCodingCode;
       this.immNoteCodingVersion = immNoteCodingVersion;
       this.immNoteCodingDisplay = immNoteCodingDisplay;
       this.immNoteCodingSystem = immNoteCodingSystem;
       this.immReasonCodeCodingUserSelected = immReasonCodeCodingUserSelected;
       this.immReasonCodeCodingCode = immReasonCodeCodingCode;
       this.immReasonCodeCodingVersion = immReasonCodeCodingVersion;
       this.immReasonCodeCodingDisplay = immReasonCodeCodingDisplay;
       this.immReasonCodeCodingSystem = immReasonCodeCodingSystem;
       this.immReasonReference = immReasonReference;
       this.immIsSubpotent = immIsSubpotent;
       this.immSbptntRsnCdngSrSlctd = immSbptntRsnCdngSrSlctd;
       this.immSubpotentReasonCodingCode = immSubpotentReasonCodingCode;
       this.immSubpotentReasonCodingVersion = immSubpotentReasonCodingVersion;
       this.immSubpotentReasonCodingDisplay = immSubpotentReasonCodingDisplay;
       this.immSubpotentReasonCodingSystem = immSubpotentReasonCodingSystem;
       this.immEducation = immEducation;
       this.immEducationDocumentType = immEducationDocumentType;
       this.immEducationReference = immEducationReference;
       this.immEducationPublicationDate = immEducationPublicationDate;
       this.immEducationPresentationDate = immEducationPresentationDate;
       this.immPrgrmlgbltCdngSrSlctd = immPrgrmlgbltCdngSrSlctd;
       this.immProgramEligibilityCodingCode = immProgramEligibilityCodingCode;
       this.immPrgrmlgbltCdngVrsn = immPrgrmlgbltCdngVrsn;
       this.immPrgrmlgbltCdngDsplay = immPrgrmlgbltCdngDsplay;
       this.immPrgrmlgbltCdngSstm = immPrgrmlgbltCdngSstm;
       this.immFndngSrcCdngSrSlctd = immFndngSrcCdngSrSlctd;
       this.immFundingSourceCodingCode = immFundingSourceCodingCode;
       this.immFundingSourceCodingVersion = immFundingSourceCodingVersion;
       this.immFundingSourceCodingDisplay = immFundingSourceCodingDisplay;
       this.immFundingSourceCodingSystem = immFundingSourceCodingSystem;
       this.immReaction = immReaction;
       this.immReactionDate = immReactionDate;
       this.immReactionDetail = immReactionDetail;
       this.immReactionReported = immReactionReported;
       this.immProtocolApplied = immProtocolApplied;
       this.immProtocolAppliedSeries = immProtocolAppliedSeries;
       this.immProtocolAppliedAuthority = immProtocolAppliedAuthority;
       this.immPrtclppldTrgtDssCdngSrSlctd = immPrtclppldTrgtDssCdngSrSlctd;
       this.immPrtclppldTrgtDssCdngCde = immPrtclppldTrgtDssCdngCde;
       this.immPrtclppldTrgtDssCdngVrsn = immPrtclppldTrgtDssCdngVrsn;
       this.immPrtclppldTrgtDssCdngDsplay = immPrtclppldTrgtDssCdngDsplay;
       this.immPrtclppldTrgtDssCdngSstm = immPrtclppldTrgtDssCdngSstm;
       this.immPrtclppldDsNmbrPstvnt = immPrtclppldDsNmbrPstvnt;
       this.immPrtclppldDsNmbrStrng = immPrtclppldDsNmbrStrng;
       this.immPrtclppldSrsDssPstvnt = immPrtclppldSrsDssPstvnt;
       this.immPrtclppldSrsDssStrng = immPrtclppldSrsDssStrng;
    }
   
    public String getImmIdentifierCodingCode() {
        return this.immIdentifierCodingCode;
    }
    
    public void setImmIdentifierCodingCode(String immIdentifierCodingCode) {
        this.immIdentifierCodingCode = immIdentifierCodingCode;
    }
    
    
    
    public String getImmIdentifierCodingUserSelected() {
        return this.immIdentifierCodingUserSelected;
    }
    
    public void setImmIdentifierCodingUserSelected(String immIdentifierCodingUserSelected) {
        this.immIdentifierCodingUserSelected = immIdentifierCodingUserSelected;
    }
    
    
    
    public String getImmIdentifierCodingVersion() {
        return this.immIdentifierCodingVersion;
    }
    
    public void setImmIdentifierCodingVersion(String immIdentifierCodingVersion) {
        this.immIdentifierCodingVersion = immIdentifierCodingVersion;
    }
    
    
    
    public String getImmIdentifierCodingDisplay() {
        return this.immIdentifierCodingDisplay;
    }
    
    public void setImmIdentifierCodingDisplay(String immIdentifierCodingDisplay) {
        this.immIdentifierCodingDisplay = immIdentifierCodingDisplay;
    }
    
    
    
    public String getImmIdentifierCodingSystem() {
        return this.immIdentifierCodingSystem;
    }
    
    public void setImmIdentifierCodingSystem(String immIdentifierCodingSystem) {
        this.immIdentifierCodingSystem = immIdentifierCodingSystem;
    }
    
    
    
    public String getImmStatus() {
        return this.immStatus;
    }
    
    public void setImmStatus(String immStatus) {
        this.immStatus = immStatus;
    }
    
    
    
    public String getImmSttsRsnCdngSrSlctd() {
        return this.immSttsRsnCdngSrSlctd;
    }
    
    public void setImmSttsRsnCdngSrSlctd(String immSttsRsnCdngSrSlctd) {
        this.immSttsRsnCdngSrSlctd = immSttsRsnCdngSrSlctd;
    }
    
    
    
    public String getImmStatusReasonCodingCode() {
        return this.immStatusReasonCodingCode;
    }
    
    public void setImmStatusReasonCodingCode(String immStatusReasonCodingCode) {
        this.immStatusReasonCodingCode = immStatusReasonCodingCode;
    }
    
    
    
    public String getImmStatusReasonCodingVersion() {
        return this.immStatusReasonCodingVersion;
    }
    
    public void setImmStatusReasonCodingVersion(String immStatusReasonCodingVersion) {
        this.immStatusReasonCodingVersion = immStatusReasonCodingVersion;
    }
    
    
    
    public String getImmStatusReasonCodingDisplay() {
        return this.immStatusReasonCodingDisplay;
    }
    
    public void setImmStatusReasonCodingDisplay(String immStatusReasonCodingDisplay) {
        this.immStatusReasonCodingDisplay = immStatusReasonCodingDisplay;
    }
    
    
    
    public String getImmStatusReasonCodingSystem() {
        return this.immStatusReasonCodingSystem;
    }
    
    public void setImmStatusReasonCodingSystem(String immStatusReasonCodingSystem) {
        this.immStatusReasonCodingSystem = immStatusReasonCodingSystem;
    }
    
    
    
    public String getImmVccnCdCdngSrSlctd() {
        return this.immVccnCdCdngSrSlctd;
    }
    
    public void setImmVccnCdCdngSrSlctd(String immVccnCdCdngSrSlctd) {
        this.immVccnCdCdngSrSlctd = immVccnCdCdngSrSlctd;
    }
    
    
    
    public String getImmVaccineCodeCodingCode() {
        return this.immVaccineCodeCodingCode;
    }
    
    public void setImmVaccineCodeCodingCode(String immVaccineCodeCodingCode) {
        this.immVaccineCodeCodingCode = immVaccineCodeCodingCode;
    }
    
    
    
    public String getImmVaccineCodeCodingVersion() {
        return this.immVaccineCodeCodingVersion;
    }
    
    public void setImmVaccineCodeCodingVersion(String immVaccineCodeCodingVersion) {
        this.immVaccineCodeCodingVersion = immVaccineCodeCodingVersion;
    }
    
    
    
    public String getImmVaccineCodeCodingDisplay() {
        return this.immVaccineCodeCodingDisplay;
    }
    
    public void setImmVaccineCodeCodingDisplay(String immVaccineCodeCodingDisplay) {
        this.immVaccineCodeCodingDisplay = immVaccineCodeCodingDisplay;
    }
    
    
    
    public String getImmVaccineCodeCodingSystem() {
        return this.immVaccineCodeCodingSystem;
    }
    
    public void setImmVaccineCodeCodingSystem(String immVaccineCodeCodingSystem) {
        this.immVaccineCodeCodingSystem = immVaccineCodeCodingSystem;
    }
    
    
    
    public String getImmPnt() {
        return this.immPnt;
    }
    
    public void setImmPnt(String immPnt) {
        this.immPnt = immPnt;
    }
    
    
    
    public String getImmEncounter() {
        return this.immEncounter;
    }
    
    public void setImmEncounter(String immEncounter) {
        this.immEncounter = immEncounter;
    }
    
    
    
    public String getImmOccurrenceDatetime() {
        return this.immOccurrenceDatetime;
    }
    
    public void setImmOccurrenceDatetime(String immOccurrenceDatetime) {
        this.immOccurrenceDatetime = immOccurrenceDatetime;
    }
    
    
    
    public String getImmOccurrenceString() {
        return this.immOccurrenceString;
    }
    
    public void setImmOccurrenceString(String immOccurrenceString) {
        this.immOccurrenceString = immOccurrenceString;
    }
    
    
    
    public String getImmRecorded() {
        return this.immRecorded;
    }
    
    public void setImmRecorded(String immRecorded) {
        this.immRecorded = immRecorded;
    }
    
    
    
    public String getImmPrimarySource() {
        return this.immPrimarySource;
    }
    
    public void setImmPrimarySource(String immPrimarySource) {
        this.immPrimarySource = immPrimarySource;
    }
    
    
    
    public String getImmRprtrgnCdngSrSlctd() {
        return this.immRprtrgnCdngSrSlctd;
    }
    
    public void setImmRprtrgnCdngSrSlctd(String immRprtrgnCdngSrSlctd) {
        this.immRprtrgnCdngSrSlctd = immRprtrgnCdngSrSlctd;
    }
    
    
    
    public String getImmReportOriginCodingCode() {
        return this.immReportOriginCodingCode;
    }
    
    public void setImmReportOriginCodingCode(String immReportOriginCodingCode) {
        this.immReportOriginCodingCode = immReportOriginCodingCode;
    }
    
    
    
    public String getImmReportOriginCodingVersion() {
        return this.immReportOriginCodingVersion;
    }
    
    public void setImmReportOriginCodingVersion(String immReportOriginCodingVersion) {
        this.immReportOriginCodingVersion = immReportOriginCodingVersion;
    }
    
    
    
    public String getImmReportOriginCodingDisplay() {
        return this.immReportOriginCodingDisplay;
    }
    
    public void setImmReportOriginCodingDisplay(String immReportOriginCodingDisplay) {
        this.immReportOriginCodingDisplay = immReportOriginCodingDisplay;
    }
    
    
    
    public String getImmReportOriginCodingSystem() {
        return this.immReportOriginCodingSystem;
    }
    
    public void setImmReportOriginCodingSystem(String immReportOriginCodingSystem) {
        this.immReportOriginCodingSystem = immReportOriginCodingSystem;
    }
    
    
    
    public String getImmLocation() {
        return this.immLocation;
    }
    
    public void setImmLocation(String immLocation) {
        this.immLocation = immLocation;
    }
    
    
    
    public String getImmManufacturer() {
        return this.immManufacturer;
    }
    
    public void setImmManufacturer(String immManufacturer) {
        this.immManufacturer = immManufacturer;
    }
    
    
    
    public String getImmLotNumber() {
        return this.immLotNumber;
    }
    
    public void setImmLotNumber(String immLotNumber) {
        this.immLotNumber = immLotNumber;
    }
    
    
    
    public String getImmExpirationDate() {
        return this.immExpirationDate;
    }
    
    public void setImmExpirationDate(String immExpirationDate) {
        this.immExpirationDate = immExpirationDate;
    }
    
    
    
    public String getImmSiteCodingUserSelected() {
        return this.immSiteCodingUserSelected;
    }
    
    public void setImmSiteCodingUserSelected(String immSiteCodingUserSelected) {
        this.immSiteCodingUserSelected = immSiteCodingUserSelected;
    }
    
    
    
    public String getImmSiteCodingCode() {
        return this.immSiteCodingCode;
    }
    
    public void setImmSiteCodingCode(String immSiteCodingCode) {
        this.immSiteCodingCode = immSiteCodingCode;
    }
    
    
    
    public String getImmSiteCodingVersion() {
        return this.immSiteCodingVersion;
    }
    
    public void setImmSiteCodingVersion(String immSiteCodingVersion) {
        this.immSiteCodingVersion = immSiteCodingVersion;
    }
    
    
    
    public String getImmSiteCodingDisplay() {
        return this.immSiteCodingDisplay;
    }
    
    public void setImmSiteCodingDisplay(String immSiteCodingDisplay) {
        this.immSiteCodingDisplay = immSiteCodingDisplay;
    }
    
    
    
    public String getImmSiteCodingSystem() {
        return this.immSiteCodingSystem;
    }
    
    public void setImmSiteCodingSystem(String immSiteCodingSystem) {
        this.immSiteCodingSystem = immSiteCodingSystem;
    }
    
    
    
    public String getImmRouteCodingUserSelected() {
        return this.immRouteCodingUserSelected;
    }
    
    public void setImmRouteCodingUserSelected(String immRouteCodingUserSelected) {
        this.immRouteCodingUserSelected = immRouteCodingUserSelected;
    }
    
    
    
    public String getImmRouteCodingCode() {
        return this.immRouteCodingCode;
    }
    
    public void setImmRouteCodingCode(String immRouteCodingCode) {
        this.immRouteCodingCode = immRouteCodingCode;
    }
    
    
    
    public String getImmRouteCodingVersion() {
        return this.immRouteCodingVersion;
    }
    
    public void setImmRouteCodingVersion(String immRouteCodingVersion) {
        this.immRouteCodingVersion = immRouteCodingVersion;
    }
    
    
    
    public String getImmRouteCodingDisplay() {
        return this.immRouteCodingDisplay;
    }
    
    public void setImmRouteCodingDisplay(String immRouteCodingDisplay) {
        this.immRouteCodingDisplay = immRouteCodingDisplay;
    }
    
    
    
    public String getImmRouteCodingSystem() {
        return this.immRouteCodingSystem;
    }
    
    public void setImmRouteCodingSystem(String immRouteCodingSystem) {
        this.immRouteCodingSystem = immRouteCodingSystem;
    }
    
    
    
    public String getImmDoseQuantity() {
        return this.immDoseQuantity;
    }
    
    public void setImmDoseQuantity(String immDoseQuantity) {
        this.immDoseQuantity = immDoseQuantity;
    }
    
    
    
    public String getImmPerformer() {
        return this.immPerformer;
    }
    
    public void setImmPerformer(String immPerformer) {
        this.immPerformer = immPerformer;
    }
    
    
    
    public String getImmPrfrmrFnctnCdngSrSlctd() {
        return this.immPrfrmrFnctnCdngSrSlctd;
    }
    
    public void setImmPrfrmrFnctnCdngSrSlctd(String immPrfrmrFnctnCdngSrSlctd) {
        this.immPrfrmrFnctnCdngSrSlctd = immPrfrmrFnctnCdngSrSlctd;
    }
    
    
    
    public String getImmPerformerFunctionCodingCode() {
        return this.immPerformerFunctionCodingCode;
    }
    
    public void setImmPerformerFunctionCodingCode(String immPerformerFunctionCodingCode) {
        this.immPerformerFunctionCodingCode = immPerformerFunctionCodingCode;
    }
    
    
    
    public String getImmPrfrmrFnctnCdngVrsn() {
        return this.immPrfrmrFnctnCdngVrsn;
    }
    
    public void setImmPrfrmrFnctnCdngVrsn(String immPrfrmrFnctnCdngVrsn) {
        this.immPrfrmrFnctnCdngVrsn = immPrfrmrFnctnCdngVrsn;
    }
    
    
    
    public String getImmPrfrmrFnctnCdngDsplay() {
        return this.immPrfrmrFnctnCdngDsplay;
    }
    
    public void setImmPrfrmrFnctnCdngDsplay(String immPrfrmrFnctnCdngDsplay) {
        this.immPrfrmrFnctnCdngDsplay = immPrfrmrFnctnCdngDsplay;
    }
    
    
    
    public String getImmPrfrmrFnctnCdngSstm() {
        return this.immPrfrmrFnctnCdngSstm;
    }
    
    public void setImmPrfrmrFnctnCdngSstm(String immPrfrmrFnctnCdngSstm) {
        this.immPrfrmrFnctnCdngSstm = immPrfrmrFnctnCdngSstm;
    }
    
    
    
    public String getImmPerformerActor() {
        return this.immPerformerActor;
    }
    
    public void setImmPerformerActor(String immPerformerActor) {
        this.immPerformerActor = immPerformerActor;
    }
    
    
    
    public String getImmNoteCodingUserSelected() {
        return this.immNoteCodingUserSelected;
    }
    
    public void setImmNoteCodingUserSelected(String immNoteCodingUserSelected) {
        this.immNoteCodingUserSelected = immNoteCodingUserSelected;
    }
    
    
    
    public String getImmNoteCodingCode() {
        return this.immNoteCodingCode;
    }
    
    public void setImmNoteCodingCode(String immNoteCodingCode) {
        this.immNoteCodingCode = immNoteCodingCode;
    }
    
    
    
    public String getImmNoteCodingVersion() {
        return this.immNoteCodingVersion;
    }
    
    public void setImmNoteCodingVersion(String immNoteCodingVersion) {
        this.immNoteCodingVersion = immNoteCodingVersion;
    }
    
    
    
    public String getImmNoteCodingDisplay() {
        return this.immNoteCodingDisplay;
    }
    
    public void setImmNoteCodingDisplay(String immNoteCodingDisplay) {
        this.immNoteCodingDisplay = immNoteCodingDisplay;
    }
    
    
    
    public String getImmNoteCodingSystem() {
        return this.immNoteCodingSystem;
    }
    
    public void setImmNoteCodingSystem(String immNoteCodingSystem) {
        this.immNoteCodingSystem = immNoteCodingSystem;
    }
    
    
    
    public String getImmReasonCodeCodingUserSelected() {
        return this.immReasonCodeCodingUserSelected;
    }
    
    public void setImmReasonCodeCodingUserSelected(String immReasonCodeCodingUserSelected) {
        this.immReasonCodeCodingUserSelected = immReasonCodeCodingUserSelected;
    }
    
    
    
    public String getImmReasonCodeCodingCode() {
        return this.immReasonCodeCodingCode;
    }
    
    public void setImmReasonCodeCodingCode(String immReasonCodeCodingCode) {
        this.immReasonCodeCodingCode = immReasonCodeCodingCode;
    }
    
    
    
    public String getImmReasonCodeCodingVersion() {
        return this.immReasonCodeCodingVersion;
    }
    
    public void setImmReasonCodeCodingVersion(String immReasonCodeCodingVersion) {
        this.immReasonCodeCodingVersion = immReasonCodeCodingVersion;
    }
    
    
    
    public String getImmReasonCodeCodingDisplay() {
        return this.immReasonCodeCodingDisplay;
    }
    
    public void setImmReasonCodeCodingDisplay(String immReasonCodeCodingDisplay) {
        this.immReasonCodeCodingDisplay = immReasonCodeCodingDisplay;
    }
    
    
    
    public String getImmReasonCodeCodingSystem() {
        return this.immReasonCodeCodingSystem;
    }
    
    public void setImmReasonCodeCodingSystem(String immReasonCodeCodingSystem) {
        this.immReasonCodeCodingSystem = immReasonCodeCodingSystem;
    }
    
    
    
    public String getImmReasonReference() {
        return this.immReasonReference;
    }
    
    public void setImmReasonReference(String immReasonReference) {
        this.immReasonReference = immReasonReference;
    }
    
    
    
    public String getImmIsSubpotent() {
        return this.immIsSubpotent;
    }
    
    public void setImmIsSubpotent(String immIsSubpotent) {
        this.immIsSubpotent = immIsSubpotent;
    }
    
    
    
    public String getImmSbptntRsnCdngSrSlctd() {
        return this.immSbptntRsnCdngSrSlctd;
    }
    
    public void setImmSbptntRsnCdngSrSlctd(String immSbptntRsnCdngSrSlctd) {
        this.immSbptntRsnCdngSrSlctd = immSbptntRsnCdngSrSlctd;
    }
    
    
    
    public String getImmSubpotentReasonCodingCode() {
        return this.immSubpotentReasonCodingCode;
    }
    
    public void setImmSubpotentReasonCodingCode(String immSubpotentReasonCodingCode) {
        this.immSubpotentReasonCodingCode = immSubpotentReasonCodingCode;
    }
    
    
    
    public String getImmSubpotentReasonCodingVersion() {
        return this.immSubpotentReasonCodingVersion;
    }
    
    public void setImmSubpotentReasonCodingVersion(String immSubpotentReasonCodingVersion) {
        this.immSubpotentReasonCodingVersion = immSubpotentReasonCodingVersion;
    }
    
    
    
    public String getImmSubpotentReasonCodingDisplay() {
        return this.immSubpotentReasonCodingDisplay;
    }
    
    public void setImmSubpotentReasonCodingDisplay(String immSubpotentReasonCodingDisplay) {
        this.immSubpotentReasonCodingDisplay = immSubpotentReasonCodingDisplay;
    }
    
    
    
    public String getImmSubpotentReasonCodingSystem() {
        return this.immSubpotentReasonCodingSystem;
    }
    
    public void setImmSubpotentReasonCodingSystem(String immSubpotentReasonCodingSystem) {
        this.immSubpotentReasonCodingSystem = immSubpotentReasonCodingSystem;
    }
    
    
    
    public String getImmEducation() {
        return this.immEducation;
    }
    
    public void setImmEducation(String immEducation) {
        this.immEducation = immEducation;
    }
    
    
    
    public String getImmEducationDocumentType() {
        return this.immEducationDocumentType;
    }
    
    public void setImmEducationDocumentType(String immEducationDocumentType) {
        this.immEducationDocumentType = immEducationDocumentType;
    }
    
    
    
    public String getImmEducationReference() {
        return this.immEducationReference;
    }
    
    public void setImmEducationReference(String immEducationReference) {
        this.immEducationReference = immEducationReference;
    }
    
    
    
    public String getImmEducationPublicationDate() {
        return this.immEducationPublicationDate;
    }
    
    public void setImmEducationPublicationDate(String immEducationPublicationDate) {
        this.immEducationPublicationDate = immEducationPublicationDate;
    }
    
    
    
    public String getImmEducationPresentationDate() {
        return this.immEducationPresentationDate;
    }
    
    public void setImmEducationPresentationDate(String immEducationPresentationDate) {
        this.immEducationPresentationDate = immEducationPresentationDate;
    }
    
    
    
    public String getImmPrgrmlgbltCdngSrSlctd() {
        return this.immPrgrmlgbltCdngSrSlctd;
    }
    
    public void setImmPrgrmlgbltCdngSrSlctd(String immPrgrmlgbltCdngSrSlctd) {
        this.immPrgrmlgbltCdngSrSlctd = immPrgrmlgbltCdngSrSlctd;
    }
    
    
    
    public String getImmProgramEligibilityCodingCode() {
        return this.immProgramEligibilityCodingCode;
    }
    
    public void setImmProgramEligibilityCodingCode(String immProgramEligibilityCodingCode) {
        this.immProgramEligibilityCodingCode = immProgramEligibilityCodingCode;
    }
    
    
    
    public String getImmPrgrmlgbltCdngVrsn() {
        return this.immPrgrmlgbltCdngVrsn;
    }
    
    public void setImmPrgrmlgbltCdngVrsn(String immPrgrmlgbltCdngVrsn) {
        this.immPrgrmlgbltCdngVrsn = immPrgrmlgbltCdngVrsn;
    }
    
    
    
    public String getImmPrgrmlgbltCdngDsplay() {
        return this.immPrgrmlgbltCdngDsplay;
    }
    
    public void setImmPrgrmlgbltCdngDsplay(String immPrgrmlgbltCdngDsplay) {
        this.immPrgrmlgbltCdngDsplay = immPrgrmlgbltCdngDsplay;
    }
    
    
    
    public String getImmPrgrmlgbltCdngSstm() {
        return this.immPrgrmlgbltCdngSstm;
    }
    
    public void setImmPrgrmlgbltCdngSstm(String immPrgrmlgbltCdngSstm) {
        this.immPrgrmlgbltCdngSstm = immPrgrmlgbltCdngSstm;
    }
    
    
    
    public String getImmFndngSrcCdngSrSlctd() {
        return this.immFndngSrcCdngSrSlctd;
    }
    
    public void setImmFndngSrcCdngSrSlctd(String immFndngSrcCdngSrSlctd) {
        this.immFndngSrcCdngSrSlctd = immFndngSrcCdngSrSlctd;
    }
    
    
    
    public String getImmFundingSourceCodingCode() {
        return this.immFundingSourceCodingCode;
    }
    
    public void setImmFundingSourceCodingCode(String immFundingSourceCodingCode) {
        this.immFundingSourceCodingCode = immFundingSourceCodingCode;
    }
    
    
    
    public String getImmFundingSourceCodingVersion() {
        return this.immFundingSourceCodingVersion;
    }
    
    public void setImmFundingSourceCodingVersion(String immFundingSourceCodingVersion) {
        this.immFundingSourceCodingVersion = immFundingSourceCodingVersion;
    }
    
    
    
    public String getImmFundingSourceCodingDisplay() {
        return this.immFundingSourceCodingDisplay;
    }
    
    public void setImmFundingSourceCodingDisplay(String immFundingSourceCodingDisplay) {
        this.immFundingSourceCodingDisplay = immFundingSourceCodingDisplay;
    }
    
    
    
    public String getImmFundingSourceCodingSystem() {
        return this.immFundingSourceCodingSystem;
    }
    
    public void setImmFundingSourceCodingSystem(String immFundingSourceCodingSystem) {
        this.immFundingSourceCodingSystem = immFundingSourceCodingSystem;
    }
    
    
    
    public String getImmReaction() {
        return this.immReaction;
    }
    
    public void setImmReaction(String immReaction) {
        this.immReaction = immReaction;
    }
    
    
    
    public String getImmReactionDate() {
        return this.immReactionDate;
    }
    
    public void setImmReactionDate(String immReactionDate) {
        this.immReactionDate = immReactionDate;
    }
    
    
    
    public String getImmReactionDetail() {
        return this.immReactionDetail;
    }
    
    public void setImmReactionDetail(String immReactionDetail) {
        this.immReactionDetail = immReactionDetail;
    }
    
    
    
    public String getImmReactionReported() {
        return this.immReactionReported;
    }
    
    public void setImmReactionReported(String immReactionReported) {
        this.immReactionReported = immReactionReported;
    }
    
    
    
    public String getImmProtocolApplied() {
        return this.immProtocolApplied;
    }
    
    public void setImmProtocolApplied(String immProtocolApplied) {
        this.immProtocolApplied = immProtocolApplied;
    }
    
    
    
    public String getImmProtocolAppliedSeries() {
        return this.immProtocolAppliedSeries;
    }
    
    public void setImmProtocolAppliedSeries(String immProtocolAppliedSeries) {
        this.immProtocolAppliedSeries = immProtocolAppliedSeries;
    }
    
    
    
    public String getImmProtocolAppliedAuthority() {
        return this.immProtocolAppliedAuthority;
    }
    
    public void setImmProtocolAppliedAuthority(String immProtocolAppliedAuthority) {
        this.immProtocolAppliedAuthority = immProtocolAppliedAuthority;
    }
    
    
    
    public String getImmPrtclppldTrgtDssCdngSrSlctd() {
        return this.immPrtclppldTrgtDssCdngSrSlctd;
    }
    
    public void setImmPrtclppldTrgtDssCdngSrSlctd(String immPrtclppldTrgtDssCdngSrSlctd) {
        this.immPrtclppldTrgtDssCdngSrSlctd = immPrtclppldTrgtDssCdngSrSlctd;
    }
    
    
    
    public String getImmPrtclppldTrgtDssCdngCde() {
        return this.immPrtclppldTrgtDssCdngCde;
    }
    
    public void setImmPrtclppldTrgtDssCdngCde(String immPrtclppldTrgtDssCdngCde) {
        this.immPrtclppldTrgtDssCdngCde = immPrtclppldTrgtDssCdngCde;
    }
    
    
    
    public String getImmPrtclppldTrgtDssCdngVrsn() {
        return this.immPrtclppldTrgtDssCdngVrsn;
    }
    
    public void setImmPrtclppldTrgtDssCdngVrsn(String immPrtclppldTrgtDssCdngVrsn) {
        this.immPrtclppldTrgtDssCdngVrsn = immPrtclppldTrgtDssCdngVrsn;
    }
    
    
    
    public String getImmPrtclppldTrgtDssCdngDsplay() {
        return this.immPrtclppldTrgtDssCdngDsplay;
    }
    
    public void setImmPrtclppldTrgtDssCdngDsplay(String immPrtclppldTrgtDssCdngDsplay) {
        this.immPrtclppldTrgtDssCdngDsplay = immPrtclppldTrgtDssCdngDsplay;
    }
    
    
    
    public String getImmPrtclppldTrgtDssCdngSstm() {
        return this.immPrtclppldTrgtDssCdngSstm;
    }
    
    public void setImmPrtclppldTrgtDssCdngSstm(String immPrtclppldTrgtDssCdngSstm) {
        this.immPrtclppldTrgtDssCdngSstm = immPrtclppldTrgtDssCdngSstm;
    }
    
    
    
    public String getImmPrtclppldDsNmbrPstvnt() {
        return this.immPrtclppldDsNmbrPstvnt;
    }
    
    public void setImmPrtclppldDsNmbrPstvnt(String immPrtclppldDsNmbrPstvnt) {
        this.immPrtclppldDsNmbrPstvnt = immPrtclppldDsNmbrPstvnt;
    }
    
    
    
    public String getImmPrtclppldDsNmbrStrng() {
        return this.immPrtclppldDsNmbrStrng;
    }
    
    public void setImmPrtclppldDsNmbrStrng(String immPrtclppldDsNmbrStrng) {
        this.immPrtclppldDsNmbrStrng = immPrtclppldDsNmbrStrng;
    }
    
    
    
    public String getImmPrtclppldSrsDssPstvnt() {
        return this.immPrtclppldSrsDssPstvnt;
    }
    
    public void setImmPrtclppldSrsDssPstvnt(String immPrtclppldSrsDssPstvnt) {
        this.immPrtclppldSrsDssPstvnt = immPrtclppldSrsDssPstvnt;
    }
    
    
    
    public String getImmPrtclppldSrsDssStrng() {
        return this.immPrtclppldSrsDssStrng;
    }
    
    public void setImmPrtclppldSrsDssStrng(String immPrtclppldSrsDssStrng) {
        this.immPrtclppldSrsDssStrng = immPrtclppldSrsDssStrng;
    }
    
    
    




}


