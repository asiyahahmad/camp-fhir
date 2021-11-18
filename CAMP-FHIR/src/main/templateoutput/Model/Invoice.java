// // default package
package main.templateoutput.Model;
// Generated Nov 18, 2021, 1:47:20 PM by Hibernate Tools 5.6.1.Final



/**
 * Invoice generated by hbm2java
 */
public class Invoice  implements java.io.Serializable {


     private String invoiceIdentifierCodingCode;
     private String invcDntfrCdngSrSlctd;
     private String invoiceIdentifierCodingDisplay;
     private String invoiceIdentifierCodingVersion;
     private String invoiceIdentifierCodingSystem;
     private String invoiceStatus;
     private String invoiceCancelledReason;
     private String invoiceTypeCodingUserSelected;
     private String invoiceTypeCodingCode;
     private String invoiceTypeCodingDisplay;
     private String invoiceTypeCodingVersion;
     private String invoiceTypeCodingSystem;
     private String invoiceSubject;
     private String invoiceRecipient;
     private String invoiceDate;
     private String invoiceParticipant;
     private String invcPrtcpntRlCdngSrSlctd;
     private String invcPrtcpntRlCdngCde;
     private String invcPrtcpntRlCdngDsplay;
     private String invcPrtcpntRlCdngVrsn;
     private String invcPrtcpntRlCdngSstm;
     private String invoiceParticipantActor;
     private String invoiceIssuer;
     private String invoiceAccount;
     private String invoiceLineItem;
     private String invoiceLineItemSequence;
     private String invcLntmChrgtmRfrnce;
     private String invcLntmChrgtmcdblcptCdngSrSlctd;
     private String invcLntmChrgtmcdblcptCdngCde;
     private String invcLntmChrgtmcdblcptCdngDsplay;
     private String invcLntmChrgtmcdblcptCdngVrsn;
     private String invcLntmChrgtmcdblcptCdngSstm;
     private String invoiceLineItemPriceComponent;
     private String invcLntmPrcCmpnntTpe;
     private String invcLntmPrcCmpnntCdCdngSrSlctd;
     private String invcLntmPrcCmpnntCdCdngCde;
     private String invcLntmPrcCmpnntCdCdngDsplay;
     private String invcLntmPrcCmpnntCdCdngVrsn;
     private String invcLntmPrcCmpnntCdCdngSstm;
     private String invcLntmPrcCmpnntFctr;
     private String invcLntmPrcCmpnntMntCdngSrSlctd;
     private String invcLntmPrcCmpnntMntCdngCde;
     private String invcLntmPrcCmpnntMntCdngDsplay;
     private String invcLntmPrcCmpnntMntCdngVrsn;
     private String invcLntmPrcCmpnntMntCdngSstm;
     private String invoiceTotalPriceComponent;
     private String invcTtlNtCdngSrSlctd;
     private String invoiceTotalNetCodingCode;
     private String invoiceTotalNetCodingDisplay;
     private String invoiceTotalNetCodingVersion;
     private String invoiceTotalNetCodingSystem;
     private String invcTtlGrssCdngSrSlctd;
     private String invoiceTotalGrossCodingCode;
     private String invoiceTotalGrossCodingDisplay;
     private String invoiceTotalGrossCodingVersion;
     private String invoiceTotalGrossCodingSystem;
     private String invoicePaymentTerms;
     private String invoiceNoteCodingUserSelected;
     private String invoiceNoteCodingCode;
     private String invoiceNoteCodingDisplay;
     private String invoiceNoteCodingVersion;
     private String invoiceNoteCodingSystem;

    public Invoice() {
    }

	
    public Invoice(String invoiceIdentifierCodingCode) {
        this.invoiceIdentifierCodingCode = invoiceIdentifierCodingCode;
    }
    public Invoice(String invoiceIdentifierCodingCode, String invcDntfrCdngSrSlctd, String invoiceIdentifierCodingDisplay, String invoiceIdentifierCodingVersion, String invoiceIdentifierCodingSystem, String invoiceStatus, String invoiceCancelledReason, String invoiceTypeCodingUserSelected, String invoiceTypeCodingCode, String invoiceTypeCodingDisplay, String invoiceTypeCodingVersion, String invoiceTypeCodingSystem, String invoiceSubject, String invoiceRecipient, String invoiceDate, String invoiceParticipant, String invcPrtcpntRlCdngSrSlctd, String invcPrtcpntRlCdngCde, String invcPrtcpntRlCdngDsplay, String invcPrtcpntRlCdngVrsn, String invcPrtcpntRlCdngSstm, String invoiceParticipantActor, String invoiceIssuer, String invoiceAccount, String invoiceLineItem, String invoiceLineItemSequence, String invcLntmChrgtmRfrnce, String invcLntmChrgtmcdblcptCdngSrSlctd, String invcLntmChrgtmcdblcptCdngCde, String invcLntmChrgtmcdblcptCdngDsplay, String invcLntmChrgtmcdblcptCdngVrsn, String invcLntmChrgtmcdblcptCdngSstm, String invoiceLineItemPriceComponent, String invcLntmPrcCmpnntTpe, String invcLntmPrcCmpnntCdCdngSrSlctd, String invcLntmPrcCmpnntCdCdngCde, String invcLntmPrcCmpnntCdCdngDsplay, String invcLntmPrcCmpnntCdCdngVrsn, String invcLntmPrcCmpnntCdCdngSstm, String invcLntmPrcCmpnntFctr, String invcLntmPrcCmpnntMntCdngSrSlctd, String invcLntmPrcCmpnntMntCdngCde, String invcLntmPrcCmpnntMntCdngDsplay, String invcLntmPrcCmpnntMntCdngVrsn, String invcLntmPrcCmpnntMntCdngSstm, String invoiceTotalPriceComponent, String invcTtlNtCdngSrSlctd, String invoiceTotalNetCodingCode, String invoiceTotalNetCodingDisplay, String invoiceTotalNetCodingVersion, String invoiceTotalNetCodingSystem, String invcTtlGrssCdngSrSlctd, String invoiceTotalGrossCodingCode, String invoiceTotalGrossCodingDisplay, String invoiceTotalGrossCodingVersion, String invoiceTotalGrossCodingSystem, String invoicePaymentTerms, String invoiceNoteCodingUserSelected, String invoiceNoteCodingCode, String invoiceNoteCodingDisplay, String invoiceNoteCodingVersion, String invoiceNoteCodingSystem) {
       this.invoiceIdentifierCodingCode = invoiceIdentifierCodingCode;
       this.invcDntfrCdngSrSlctd = invcDntfrCdngSrSlctd;
       this.invoiceIdentifierCodingDisplay = invoiceIdentifierCodingDisplay;
       this.invoiceIdentifierCodingVersion = invoiceIdentifierCodingVersion;
       this.invoiceIdentifierCodingSystem = invoiceIdentifierCodingSystem;
       this.invoiceStatus = invoiceStatus;
       this.invoiceCancelledReason = invoiceCancelledReason;
       this.invoiceTypeCodingUserSelected = invoiceTypeCodingUserSelected;
       this.invoiceTypeCodingCode = invoiceTypeCodingCode;
       this.invoiceTypeCodingDisplay = invoiceTypeCodingDisplay;
       this.invoiceTypeCodingVersion = invoiceTypeCodingVersion;
       this.invoiceTypeCodingSystem = invoiceTypeCodingSystem;
       this.invoiceSubject = invoiceSubject;
       this.invoiceRecipient = invoiceRecipient;
       this.invoiceDate = invoiceDate;
       this.invoiceParticipant = invoiceParticipant;
       this.invcPrtcpntRlCdngSrSlctd = invcPrtcpntRlCdngSrSlctd;
       this.invcPrtcpntRlCdngCde = invcPrtcpntRlCdngCde;
       this.invcPrtcpntRlCdngDsplay = invcPrtcpntRlCdngDsplay;
       this.invcPrtcpntRlCdngVrsn = invcPrtcpntRlCdngVrsn;
       this.invcPrtcpntRlCdngSstm = invcPrtcpntRlCdngSstm;
       this.invoiceParticipantActor = invoiceParticipantActor;
       this.invoiceIssuer = invoiceIssuer;
       this.invoiceAccount = invoiceAccount;
       this.invoiceLineItem = invoiceLineItem;
       this.invoiceLineItemSequence = invoiceLineItemSequence;
       this.invcLntmChrgtmRfrnce = invcLntmChrgtmRfrnce;
       this.invcLntmChrgtmcdblcptCdngSrSlctd = invcLntmChrgtmcdblcptCdngSrSlctd;
       this.invcLntmChrgtmcdblcptCdngCde = invcLntmChrgtmcdblcptCdngCde;
       this.invcLntmChrgtmcdblcptCdngDsplay = invcLntmChrgtmcdblcptCdngDsplay;
       this.invcLntmChrgtmcdblcptCdngVrsn = invcLntmChrgtmcdblcptCdngVrsn;
       this.invcLntmChrgtmcdblcptCdngSstm = invcLntmChrgtmcdblcptCdngSstm;
       this.invoiceLineItemPriceComponent = invoiceLineItemPriceComponent;
       this.invcLntmPrcCmpnntTpe = invcLntmPrcCmpnntTpe;
       this.invcLntmPrcCmpnntCdCdngSrSlctd = invcLntmPrcCmpnntCdCdngSrSlctd;
       this.invcLntmPrcCmpnntCdCdngCde = invcLntmPrcCmpnntCdCdngCde;
       this.invcLntmPrcCmpnntCdCdngDsplay = invcLntmPrcCmpnntCdCdngDsplay;
       this.invcLntmPrcCmpnntCdCdngVrsn = invcLntmPrcCmpnntCdCdngVrsn;
       this.invcLntmPrcCmpnntCdCdngSstm = invcLntmPrcCmpnntCdCdngSstm;
       this.invcLntmPrcCmpnntFctr = invcLntmPrcCmpnntFctr;
       this.invcLntmPrcCmpnntMntCdngSrSlctd = invcLntmPrcCmpnntMntCdngSrSlctd;
       this.invcLntmPrcCmpnntMntCdngCde = invcLntmPrcCmpnntMntCdngCde;
       this.invcLntmPrcCmpnntMntCdngDsplay = invcLntmPrcCmpnntMntCdngDsplay;
       this.invcLntmPrcCmpnntMntCdngVrsn = invcLntmPrcCmpnntMntCdngVrsn;
       this.invcLntmPrcCmpnntMntCdngSstm = invcLntmPrcCmpnntMntCdngSstm;
       this.invoiceTotalPriceComponent = invoiceTotalPriceComponent;
       this.invcTtlNtCdngSrSlctd = invcTtlNtCdngSrSlctd;
       this.invoiceTotalNetCodingCode = invoiceTotalNetCodingCode;
       this.invoiceTotalNetCodingDisplay = invoiceTotalNetCodingDisplay;
       this.invoiceTotalNetCodingVersion = invoiceTotalNetCodingVersion;
       this.invoiceTotalNetCodingSystem = invoiceTotalNetCodingSystem;
       this.invcTtlGrssCdngSrSlctd = invcTtlGrssCdngSrSlctd;
       this.invoiceTotalGrossCodingCode = invoiceTotalGrossCodingCode;
       this.invoiceTotalGrossCodingDisplay = invoiceTotalGrossCodingDisplay;
       this.invoiceTotalGrossCodingVersion = invoiceTotalGrossCodingVersion;
       this.invoiceTotalGrossCodingSystem = invoiceTotalGrossCodingSystem;
       this.invoicePaymentTerms = invoicePaymentTerms;
       this.invoiceNoteCodingUserSelected = invoiceNoteCodingUserSelected;
       this.invoiceNoteCodingCode = invoiceNoteCodingCode;
       this.invoiceNoteCodingDisplay = invoiceNoteCodingDisplay;
       this.invoiceNoteCodingVersion = invoiceNoteCodingVersion;
       this.invoiceNoteCodingSystem = invoiceNoteCodingSystem;
    }
   
    public String getInvoiceIdentifierCodingCode() {
        return this.invoiceIdentifierCodingCode;
    }
    
    public void setInvoiceIdentifierCodingCode(String invoiceIdentifierCodingCode) {
        this.invoiceIdentifierCodingCode = invoiceIdentifierCodingCode;
    }
    
    
    
    public String getInvcDntfrCdngSrSlctd() {
        return this.invcDntfrCdngSrSlctd;
    }
    
    public void setInvcDntfrCdngSrSlctd(String invcDntfrCdngSrSlctd) {
        this.invcDntfrCdngSrSlctd = invcDntfrCdngSrSlctd;
    }
    
    
    
    public String getInvoiceIdentifierCodingDisplay() {
        return this.invoiceIdentifierCodingDisplay;
    }
    
    public void setInvoiceIdentifierCodingDisplay(String invoiceIdentifierCodingDisplay) {
        this.invoiceIdentifierCodingDisplay = invoiceIdentifierCodingDisplay;
    }
    
    
    
    public String getInvoiceIdentifierCodingVersion() {
        return this.invoiceIdentifierCodingVersion;
    }
    
    public void setInvoiceIdentifierCodingVersion(String invoiceIdentifierCodingVersion) {
        this.invoiceIdentifierCodingVersion = invoiceIdentifierCodingVersion;
    }
    
    
    
    public String getInvoiceIdentifierCodingSystem() {
        return this.invoiceIdentifierCodingSystem;
    }
    
    public void setInvoiceIdentifierCodingSystem(String invoiceIdentifierCodingSystem) {
        this.invoiceIdentifierCodingSystem = invoiceIdentifierCodingSystem;
    }
    
    
    
    public String getInvoiceStatus() {
        return this.invoiceStatus;
    }
    
    public void setInvoiceStatus(String invoiceStatus) {
        this.invoiceStatus = invoiceStatus;
    }
    
    
    
    public String getInvoiceCancelledReason() {
        return this.invoiceCancelledReason;
    }
    
    public void setInvoiceCancelledReason(String invoiceCancelledReason) {
        this.invoiceCancelledReason = invoiceCancelledReason;
    }
    
    
    
    public String getInvoiceTypeCodingUserSelected() {
        return this.invoiceTypeCodingUserSelected;
    }
    
    public void setInvoiceTypeCodingUserSelected(String invoiceTypeCodingUserSelected) {
        this.invoiceTypeCodingUserSelected = invoiceTypeCodingUserSelected;
    }
    
    
    
    public String getInvoiceTypeCodingCode() {
        return this.invoiceTypeCodingCode;
    }
    
    public void setInvoiceTypeCodingCode(String invoiceTypeCodingCode) {
        this.invoiceTypeCodingCode = invoiceTypeCodingCode;
    }
    
    
    
    public String getInvoiceTypeCodingDisplay() {
        return this.invoiceTypeCodingDisplay;
    }
    
    public void setInvoiceTypeCodingDisplay(String invoiceTypeCodingDisplay) {
        this.invoiceTypeCodingDisplay = invoiceTypeCodingDisplay;
    }
    
    
    
    public String getInvoiceTypeCodingVersion() {
        return this.invoiceTypeCodingVersion;
    }
    
    public void setInvoiceTypeCodingVersion(String invoiceTypeCodingVersion) {
        this.invoiceTypeCodingVersion = invoiceTypeCodingVersion;
    }
    
    
    
    public String getInvoiceTypeCodingSystem() {
        return this.invoiceTypeCodingSystem;
    }
    
    public void setInvoiceTypeCodingSystem(String invoiceTypeCodingSystem) {
        this.invoiceTypeCodingSystem = invoiceTypeCodingSystem;
    }
    
    
    
    public String getInvoiceSubject() {
        return this.invoiceSubject;
    }
    
    public void setInvoiceSubject(String invoiceSubject) {
        this.invoiceSubject = invoiceSubject;
    }
    
    
    
    public String getInvoiceRecipient() {
        return this.invoiceRecipient;
    }
    
    public void setInvoiceRecipient(String invoiceRecipient) {
        this.invoiceRecipient = invoiceRecipient;
    }
    
    
    
    public String getInvoiceDate() {
        return this.invoiceDate;
    }
    
    public void setInvoiceDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
    }
    
    
    
    public String getInvoiceParticipant() {
        return this.invoiceParticipant;
    }
    
    public void setInvoiceParticipant(String invoiceParticipant) {
        this.invoiceParticipant = invoiceParticipant;
    }
    
    
    
    public String getInvcPrtcpntRlCdngSrSlctd() {
        return this.invcPrtcpntRlCdngSrSlctd;
    }
    
    public void setInvcPrtcpntRlCdngSrSlctd(String invcPrtcpntRlCdngSrSlctd) {
        this.invcPrtcpntRlCdngSrSlctd = invcPrtcpntRlCdngSrSlctd;
    }
    
    
    
    public String getInvcPrtcpntRlCdngCde() {
        return this.invcPrtcpntRlCdngCde;
    }
    
    public void setInvcPrtcpntRlCdngCde(String invcPrtcpntRlCdngCde) {
        this.invcPrtcpntRlCdngCde = invcPrtcpntRlCdngCde;
    }
    
    
    
    public String getInvcPrtcpntRlCdngDsplay() {
        return this.invcPrtcpntRlCdngDsplay;
    }
    
    public void setInvcPrtcpntRlCdngDsplay(String invcPrtcpntRlCdngDsplay) {
        this.invcPrtcpntRlCdngDsplay = invcPrtcpntRlCdngDsplay;
    }
    
    
    
    public String getInvcPrtcpntRlCdngVrsn() {
        return this.invcPrtcpntRlCdngVrsn;
    }
    
    public void setInvcPrtcpntRlCdngVrsn(String invcPrtcpntRlCdngVrsn) {
        this.invcPrtcpntRlCdngVrsn = invcPrtcpntRlCdngVrsn;
    }
    
    
    
    public String getInvcPrtcpntRlCdngSstm() {
        return this.invcPrtcpntRlCdngSstm;
    }
    
    public void setInvcPrtcpntRlCdngSstm(String invcPrtcpntRlCdngSstm) {
        this.invcPrtcpntRlCdngSstm = invcPrtcpntRlCdngSstm;
    }
    
    
    
    public String getInvoiceParticipantActor() {
        return this.invoiceParticipantActor;
    }
    
    public void setInvoiceParticipantActor(String invoiceParticipantActor) {
        this.invoiceParticipantActor = invoiceParticipantActor;
    }
    
    
    
    public String getInvoiceIssuer() {
        return this.invoiceIssuer;
    }
    
    public void setInvoiceIssuer(String invoiceIssuer) {
        this.invoiceIssuer = invoiceIssuer;
    }
    
    
    
    public String getInvoiceAccount() {
        return this.invoiceAccount;
    }
    
    public void setInvoiceAccount(String invoiceAccount) {
        this.invoiceAccount = invoiceAccount;
    }
    
    
    
    public String getInvoiceLineItem() {
        return this.invoiceLineItem;
    }
    
    public void setInvoiceLineItem(String invoiceLineItem) {
        this.invoiceLineItem = invoiceLineItem;
    }
    
    
    
    public String getInvoiceLineItemSequence() {
        return this.invoiceLineItemSequence;
    }
    
    public void setInvoiceLineItemSequence(String invoiceLineItemSequence) {
        this.invoiceLineItemSequence = invoiceLineItemSequence;
    }
    
    
    
    public String getInvcLntmChrgtmRfrnce() {
        return this.invcLntmChrgtmRfrnce;
    }
    
    public void setInvcLntmChrgtmRfrnce(String invcLntmChrgtmRfrnce) {
        this.invcLntmChrgtmRfrnce = invcLntmChrgtmRfrnce;
    }
    
    
    
    public String getInvcLntmChrgtmcdblcptCdngSrSlctd() {
        return this.invcLntmChrgtmcdblcptCdngSrSlctd;
    }
    
    public void setInvcLntmChrgtmcdblcptCdngSrSlctd(String invcLntmChrgtmcdblcptCdngSrSlctd) {
        this.invcLntmChrgtmcdblcptCdngSrSlctd = invcLntmChrgtmcdblcptCdngSrSlctd;
    }
    
    
    
    public String getInvcLntmChrgtmcdblcptCdngCde() {
        return this.invcLntmChrgtmcdblcptCdngCde;
    }
    
    public void setInvcLntmChrgtmcdblcptCdngCde(String invcLntmChrgtmcdblcptCdngCde) {
        this.invcLntmChrgtmcdblcptCdngCde = invcLntmChrgtmcdblcptCdngCde;
    }
    
    
    
    public String getInvcLntmChrgtmcdblcptCdngDsplay() {
        return this.invcLntmChrgtmcdblcptCdngDsplay;
    }
    
    public void setInvcLntmChrgtmcdblcptCdngDsplay(String invcLntmChrgtmcdblcptCdngDsplay) {
        this.invcLntmChrgtmcdblcptCdngDsplay = invcLntmChrgtmcdblcptCdngDsplay;
    }
    
    
    
    public String getInvcLntmChrgtmcdblcptCdngVrsn() {
        return this.invcLntmChrgtmcdblcptCdngVrsn;
    }
    
    public void setInvcLntmChrgtmcdblcptCdngVrsn(String invcLntmChrgtmcdblcptCdngVrsn) {
        this.invcLntmChrgtmcdblcptCdngVrsn = invcLntmChrgtmcdblcptCdngVrsn;
    }
    
    
    
    public String getInvcLntmChrgtmcdblcptCdngSstm() {
        return this.invcLntmChrgtmcdblcptCdngSstm;
    }
    
    public void setInvcLntmChrgtmcdblcptCdngSstm(String invcLntmChrgtmcdblcptCdngSstm) {
        this.invcLntmChrgtmcdblcptCdngSstm = invcLntmChrgtmcdblcptCdngSstm;
    }
    
    
    
    public String getInvoiceLineItemPriceComponent() {
        return this.invoiceLineItemPriceComponent;
    }
    
    public void setInvoiceLineItemPriceComponent(String invoiceLineItemPriceComponent) {
        this.invoiceLineItemPriceComponent = invoiceLineItemPriceComponent;
    }
    
    
    
    public String getInvcLntmPrcCmpnntTpe() {
        return this.invcLntmPrcCmpnntTpe;
    }
    
    public void setInvcLntmPrcCmpnntTpe(String invcLntmPrcCmpnntTpe) {
        this.invcLntmPrcCmpnntTpe = invcLntmPrcCmpnntTpe;
    }
    
    
    
    public String getInvcLntmPrcCmpnntCdCdngSrSlctd() {
        return this.invcLntmPrcCmpnntCdCdngSrSlctd;
    }
    
    public void setInvcLntmPrcCmpnntCdCdngSrSlctd(String invcLntmPrcCmpnntCdCdngSrSlctd) {
        this.invcLntmPrcCmpnntCdCdngSrSlctd = invcLntmPrcCmpnntCdCdngSrSlctd;
    }
    
    
    
    public String getInvcLntmPrcCmpnntCdCdngCde() {
        return this.invcLntmPrcCmpnntCdCdngCde;
    }
    
    public void setInvcLntmPrcCmpnntCdCdngCde(String invcLntmPrcCmpnntCdCdngCde) {
        this.invcLntmPrcCmpnntCdCdngCde = invcLntmPrcCmpnntCdCdngCde;
    }
    
    
    
    public String getInvcLntmPrcCmpnntCdCdngDsplay() {
        return this.invcLntmPrcCmpnntCdCdngDsplay;
    }
    
    public void setInvcLntmPrcCmpnntCdCdngDsplay(String invcLntmPrcCmpnntCdCdngDsplay) {
        this.invcLntmPrcCmpnntCdCdngDsplay = invcLntmPrcCmpnntCdCdngDsplay;
    }
    
    
    
    public String getInvcLntmPrcCmpnntCdCdngVrsn() {
        return this.invcLntmPrcCmpnntCdCdngVrsn;
    }
    
    public void setInvcLntmPrcCmpnntCdCdngVrsn(String invcLntmPrcCmpnntCdCdngVrsn) {
        this.invcLntmPrcCmpnntCdCdngVrsn = invcLntmPrcCmpnntCdCdngVrsn;
    }
    
    
    
    public String getInvcLntmPrcCmpnntCdCdngSstm() {
        return this.invcLntmPrcCmpnntCdCdngSstm;
    }
    
    public void setInvcLntmPrcCmpnntCdCdngSstm(String invcLntmPrcCmpnntCdCdngSstm) {
        this.invcLntmPrcCmpnntCdCdngSstm = invcLntmPrcCmpnntCdCdngSstm;
    }
    
    
    
    public String getInvcLntmPrcCmpnntFctr() {
        return this.invcLntmPrcCmpnntFctr;
    }
    
    public void setInvcLntmPrcCmpnntFctr(String invcLntmPrcCmpnntFctr) {
        this.invcLntmPrcCmpnntFctr = invcLntmPrcCmpnntFctr;
    }
    
    
    
    public String getInvcLntmPrcCmpnntMntCdngSrSlctd() {
        return this.invcLntmPrcCmpnntMntCdngSrSlctd;
    }
    
    public void setInvcLntmPrcCmpnntMntCdngSrSlctd(String invcLntmPrcCmpnntMntCdngSrSlctd) {
        this.invcLntmPrcCmpnntMntCdngSrSlctd = invcLntmPrcCmpnntMntCdngSrSlctd;
    }
    
    
    
    public String getInvcLntmPrcCmpnntMntCdngCde() {
        return this.invcLntmPrcCmpnntMntCdngCde;
    }
    
    public void setInvcLntmPrcCmpnntMntCdngCde(String invcLntmPrcCmpnntMntCdngCde) {
        this.invcLntmPrcCmpnntMntCdngCde = invcLntmPrcCmpnntMntCdngCde;
    }
    
    
    
    public String getInvcLntmPrcCmpnntMntCdngDsplay() {
        return this.invcLntmPrcCmpnntMntCdngDsplay;
    }
    
    public void setInvcLntmPrcCmpnntMntCdngDsplay(String invcLntmPrcCmpnntMntCdngDsplay) {
        this.invcLntmPrcCmpnntMntCdngDsplay = invcLntmPrcCmpnntMntCdngDsplay;
    }
    
    
    
    public String getInvcLntmPrcCmpnntMntCdngVrsn() {
        return this.invcLntmPrcCmpnntMntCdngVrsn;
    }
    
    public void setInvcLntmPrcCmpnntMntCdngVrsn(String invcLntmPrcCmpnntMntCdngVrsn) {
        this.invcLntmPrcCmpnntMntCdngVrsn = invcLntmPrcCmpnntMntCdngVrsn;
    }
    
    
    
    public String getInvcLntmPrcCmpnntMntCdngSstm() {
        return this.invcLntmPrcCmpnntMntCdngSstm;
    }
    
    public void setInvcLntmPrcCmpnntMntCdngSstm(String invcLntmPrcCmpnntMntCdngSstm) {
        this.invcLntmPrcCmpnntMntCdngSstm = invcLntmPrcCmpnntMntCdngSstm;
    }
    
    
    
    public String getInvoiceTotalPriceComponent() {
        return this.invoiceTotalPriceComponent;
    }
    
    public void setInvoiceTotalPriceComponent(String invoiceTotalPriceComponent) {
        this.invoiceTotalPriceComponent = invoiceTotalPriceComponent;
    }
    
    
    
    public String getInvcTtlNtCdngSrSlctd() {
        return this.invcTtlNtCdngSrSlctd;
    }
    
    public void setInvcTtlNtCdngSrSlctd(String invcTtlNtCdngSrSlctd) {
        this.invcTtlNtCdngSrSlctd = invcTtlNtCdngSrSlctd;
    }
    
    
    
    public String getInvoiceTotalNetCodingCode() {
        return this.invoiceTotalNetCodingCode;
    }
    
    public void setInvoiceTotalNetCodingCode(String invoiceTotalNetCodingCode) {
        this.invoiceTotalNetCodingCode = invoiceTotalNetCodingCode;
    }
    
    
    
    public String getInvoiceTotalNetCodingDisplay() {
        return this.invoiceTotalNetCodingDisplay;
    }
    
    public void setInvoiceTotalNetCodingDisplay(String invoiceTotalNetCodingDisplay) {
        this.invoiceTotalNetCodingDisplay = invoiceTotalNetCodingDisplay;
    }
    
    
    
    public String getInvoiceTotalNetCodingVersion() {
        return this.invoiceTotalNetCodingVersion;
    }
    
    public void setInvoiceTotalNetCodingVersion(String invoiceTotalNetCodingVersion) {
        this.invoiceTotalNetCodingVersion = invoiceTotalNetCodingVersion;
    }
    
    
    
    public String getInvoiceTotalNetCodingSystem() {
        return this.invoiceTotalNetCodingSystem;
    }
    
    public void setInvoiceTotalNetCodingSystem(String invoiceTotalNetCodingSystem) {
        this.invoiceTotalNetCodingSystem = invoiceTotalNetCodingSystem;
    }
    
    
    
    public String getInvcTtlGrssCdngSrSlctd() {
        return this.invcTtlGrssCdngSrSlctd;
    }
    
    public void setInvcTtlGrssCdngSrSlctd(String invcTtlGrssCdngSrSlctd) {
        this.invcTtlGrssCdngSrSlctd = invcTtlGrssCdngSrSlctd;
    }
    
    
    
    public String getInvoiceTotalGrossCodingCode() {
        return this.invoiceTotalGrossCodingCode;
    }
    
    public void setInvoiceTotalGrossCodingCode(String invoiceTotalGrossCodingCode) {
        this.invoiceTotalGrossCodingCode = invoiceTotalGrossCodingCode;
    }
    
    
    
    public String getInvoiceTotalGrossCodingDisplay() {
        return this.invoiceTotalGrossCodingDisplay;
    }
    
    public void setInvoiceTotalGrossCodingDisplay(String invoiceTotalGrossCodingDisplay) {
        this.invoiceTotalGrossCodingDisplay = invoiceTotalGrossCodingDisplay;
    }
    
    
    
    public String getInvoiceTotalGrossCodingVersion() {
        return this.invoiceTotalGrossCodingVersion;
    }
    
    public void setInvoiceTotalGrossCodingVersion(String invoiceTotalGrossCodingVersion) {
        this.invoiceTotalGrossCodingVersion = invoiceTotalGrossCodingVersion;
    }
    
    
    
    public String getInvoiceTotalGrossCodingSystem() {
        return this.invoiceTotalGrossCodingSystem;
    }
    
    public void setInvoiceTotalGrossCodingSystem(String invoiceTotalGrossCodingSystem) {
        this.invoiceTotalGrossCodingSystem = invoiceTotalGrossCodingSystem;
    }
    
    
    
    public String getInvoicePaymentTerms() {
        return this.invoicePaymentTerms;
    }
    
    public void setInvoicePaymentTerms(String invoicePaymentTerms) {
        this.invoicePaymentTerms = invoicePaymentTerms;
    }
    
    
    
    public String getInvoiceNoteCodingUserSelected() {
        return this.invoiceNoteCodingUserSelected;
    }
    
    public void setInvoiceNoteCodingUserSelected(String invoiceNoteCodingUserSelected) {
        this.invoiceNoteCodingUserSelected = invoiceNoteCodingUserSelected;
    }
    
    
    
    public String getInvoiceNoteCodingCode() {
        return this.invoiceNoteCodingCode;
    }
    
    public void setInvoiceNoteCodingCode(String invoiceNoteCodingCode) {
        this.invoiceNoteCodingCode = invoiceNoteCodingCode;
    }
    
    
    
    public String getInvoiceNoteCodingDisplay() {
        return this.invoiceNoteCodingDisplay;
    }
    
    public void setInvoiceNoteCodingDisplay(String invoiceNoteCodingDisplay) {
        this.invoiceNoteCodingDisplay = invoiceNoteCodingDisplay;
    }
    
    
    
    public String getInvoiceNoteCodingVersion() {
        return this.invoiceNoteCodingVersion;
    }
    
    public void setInvoiceNoteCodingVersion(String invoiceNoteCodingVersion) {
        this.invoiceNoteCodingVersion = invoiceNoteCodingVersion;
    }
    
    
    
    public String getInvoiceNoteCodingSystem() {
        return this.invoiceNoteCodingSystem;
    }
    
    public void setInvoiceNoteCodingSystem(String invoiceNoteCodingSystem) {
        this.invoiceNoteCodingSystem = invoiceNoteCodingSystem;
    }
    
    
    




}

