package main.java.com.campfhir.service.conversion;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hl7.fhir.r4.model.BooleanType;
import org.hl7.fhir.r4.model.CodeableConcept;
import org.hl7.fhir.r4.model.Coding;
import org.hl7.fhir.r4.model.Dosage;
import org.hl7.fhir.r4.model.Dosage.DosageDoseAndRateComponent;
import org.hl7.fhir.r4.model.Encounter.EncounterStatus;
import org.hl7.fhir.r4.model.Medication.MedicationStatus;
import org.hl7.fhir.r4.model.Duration;
import org.hl7.fhir.r4.model.Period;
import org.hl7.fhir.r4.model.Reference;
import org.hl7.fhir.r4.model.SimpleQuantity;
import org.hl7.fhir.r4.model.MedicationRequest.MedicationRequestDispenseRequestComponent;
import org.hl7.fhir.r4.model.MedicationRequest.MedicationRequestIntent;
import org.hl7.fhir.r4.model.MedicationRequest.MedicationRequestStatus;
import org.hl7.fhir.r4.model.MedicationRequest.MedicationRequestSubstitutionComponent;

import main.java.com.campfhir.model.MedicationRequest;

import org.hl7.fhir.exceptions.FHIRException;

/**
*
* @author  James Champion
* @version 1.0
* @since   2019-02-08 
*/
public class MedicationRequestConversion 
{
	public org.hl7.fhir.r4.model.MedicationRequest MedicationRequests(MedicationRequest medication) throws ParseException, FHIRException, IOException
	{		
		org.hl7.fhir.r4.model.MedicationRequest n = new org.hl7.fhir.r4.model.MedicationRequest();	
		
		n.setStatus(MedicationRequestStatus.fromCode(medication.getMED_STATUS()));
		
		/******************** MED_IDENTIFIER ********************************************************************************
		 * MED_IDENTIFIER maps to MedicationRequest / identifier
		 ********************************************************************************************************************/
		n.setId(medication.getMED_IDENTIFIER());
		
		/******************** MED_SUBJECT_REFERENCE *************************************************************************
		 * MED_SUBJECT_REFERENCE maps to MedicationRequest / subject / reference
		 ********************************************************************************************************************/
		Reference reference = new Reference().setReference(medication.getMED_SUBJECT_REFERENCE());
		n.setSubject(reference);
		
		/******************** MED_CONTEXT_REFERENCE  *************************************************************************
		 * MED_CONTEXT_REFERENCE maps to MedicationRequest / context / reference
		 ********************************************************************************************************************/

		
		/******************** MED_MEDREF_REFERENCE **************************************************************************
		 * MED_MEDREF_REFERENCE maps to MedicationRequest / medicationReference / reference
		 ********************************************************************************************************************/

		
		/******************** MED_MEDCODCON_CODING_CODE *********************************************************************
		 * MED_MEDCODCON_CODING_CODE maps to MedicationRequest / medicationCodeableConcept / coding / code
		 ********************************************************************************************************************/
		
		
		/******************** MED_MEDCODCON_CODING_SYS **********************************************************************
		 * MED_MEDCODCON_CODING_SYS maps to MedicationRequest / medicationCodeableConcept / coding / system
		 ********************************************************************************************************************/
		
		
		/******************** MED_MEDCODCON_CODING_DISPLAY ******************************************************************
		 * MED_MEDCODCON_CODING_DISPLAY maps to MedicationRequest / medicationCodeableConcept / coding / display
		 ********************************************************************************************************************/
		
		  if(medication.getMED_MEDCODCON_CODING_CODE() != null)
		  {
			  CodeableConcept med = new CodeableConcept();
			  med.addCoding()
			      .setSystem(medication.getMED_MEDCODCON_CODING_SYS())
			      .setCode(medication.getMED_MEDCODCON_CODING_CODE())
			      .setDisplay(medication.getMED_MEDCODCON_CODING_DISPLAY());
			  
			  n.setMedication(med);
		  }
		  else if(medication.getMED_CONTEXT_REFERENCE() != null)
		  {		  
			  Reference creference = new Reference().setReference(medication.getMED_CONTEXT_REFERENCE());
			  n.setEncounter(creference);
		  }
			
		
		/******************** MED_AUTHORED_ON *******************************************************************************
		 * MED_AUTHORED_ON maps to MedicationRequest / authoredOn
		 ********************************************************************************************************************/
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-M-dd hh:mm:ss");
		
		if(medication.getMED_AUTHORED_ON() != null)
		{			
			try 
			{
				Date date1;
				date1 = sdf1.parse(medication.getMED_AUTHORED_ON());
				n.setAuthoredOn(date1);
			} 
			catch (ParseException e) 
			{
				e.printStackTrace();
			}
		}
		
		/******************** MED_DISPREQ_PERIOD_START **********************************************************************
		 * MED_DISPREQ_PERIOD_START maps to MedicationRequest / dispenseRequest / validityPeriod / start
		 ********************************************************************************************************************/
		Period DISPREQ = new Period();
		MedicationRequestDispenseRequestComponent dispenseRequest = new MedicationRequestDispenseRequestComponent();
		if (medication.getMED_DISPREQ_PERIOD_START() != null)
		{
			
			
			try 
			{
				Date d1;
				d1 = sdf1.parse(medication.getMED_DISPREQ_PERIOD_START());
				DISPREQ.setStart(d1);
			} 
			catch (ParseException e) 
			{
				e.printStackTrace();
			}
			
			dispenseRequest.setValidityPeriod(DISPREQ);
		}
		
		/******************** MED_DISPREQ_PERIOD_END ************************************************************************
		 * MED_DISPREQ_PERIOD_END maps to MedicationRequest / dispenseRequest / validityPeriod / end
		 ********************************************************************************************************************/
		if (medication.getMED_DISPREQ_PERIOD_END() != null)
		{
			if(medication.getMED_DISPREQ_PERIOD_END() != null)
			{
				try 
				{
					Date d2;
					d2 = sdf1.parse(medication.getMED_DISPREQ_PERIOD_END());
					DISPREQ.setEnd(d2);
				} 
				catch (ParseException e) 
				{
					e.printStackTrace();
				}
										
			}
			
			dispenseRequest.setValidityPeriod(DISPREQ);
		}
		
		/******************** MED_DISPREQ_QUANT *****************************************************************************
		 * MED_DISPREQ_QUANT maps to MedicationRequest / dispenseRequest / quantity
		 ********************************************************************************************************************/
		if(medication.getMED_DISPREQ_QUANT() != null)
		{
			SimpleQuantity x = new SimpleQuantity();
			x.setValue(Double.parseDouble(medication.getMED_DISPREQ_QUANT()));
			dispenseRequest.setQuantity(x);
		}
		
		/******************** MED_DISPREQ_NUMREPS ***************************************************************************
		 * MED_DISPREQ_NUMREPS maps to MedicationRequest / dispenseRequest / numberOfRepeatsAllowed
		 ********************************************************************************************************************/
		if(medication.getMED_DISPREQ_NUMREPS() != null)
		{
			dispenseRequest.setNumberOfRepeatsAllowed(Integer.parseInt(medication.getMED_DISPREQ_NUMREPS()));
		}
		
		/******************** MED_DISPREQ_EXPSUPP ***************************************************************************
		 * MED_DISPREQ_EXPSUPP maps to MedicationRequest / dispenseRequest / expectedSupplyDuration
		 ********************************************************************************************************************/
		if(medication.getMED_DISPREQ_EXPSUPP() != null)
		{
			Duration duration = new Duration();
			duration.setValue(Double.parseDouble(medication.getMED_DISPREQ_EXPSUPP()));
			dispenseRequest.setExpectedSupplyDuration(duration);
		}
		
        n.setDispenseRequest(dispenseRequest);
		
		Reference requester  = new Reference();;
		/******************** MED_REQ_AGENT_REFERENCE ************************************************************************
		 * MED_REQ_AGENT_REFERENCE maps to MedicationRequest / agent / reference
		 ********************************************************************************************************************/
	
		requester.setReference(medication.getMED_REQ_AGENT_REFERENCE());

		n.setRequester(requester);
		
		
		/******************** MED_INTENT_CODE *******************************************************************************
		 * MED_INTENT_CODE maps to MedicationRequest / intent
		 ********************************************************************************************************************/
		MedicationRequestIntent intent;
		try 
		{
			intent = MedicationRequestIntent.fromCode(medication.getMED_INTENT_CODE());
			n.setIntent(intent);
		} 
		catch (FHIRException e) 
		{
			e.printStackTrace();
		}				
	
		CodeableConcept cc = new CodeableConcept();
		List<CodeableConcept> ccc = new ArrayList<>();
		
		/******************** MED_CAT_CODING_DISPLAY ************************************************************************
		 * MED_CAT_CODING_DISPLAY maps to MedicationRequest / category / coding / display
		 ********************************************************************************************************************/
		cc.addCoding().setDisplay(medication.getMED_CAT_CODING_DISPLAY())
		
		/******************** MED_CAT_CODING_SYS ****************************************************************************
		 * MED_CAT_CODING_SYS maps to MedicationRequest / category / coding / system
		 ********************************************************************************************************************/
		.setSystem(medication.getMED_CAT_CODING_SYS())
			
		/******************** MED_CAT_CODING_CODE ****************************************************************************
		 * MED_CAT_CODING_CODE maps to MedicationRequest / category / coding / code
		 ********************************************************************************************************************/
		.setCode(medication.getMED_CAT_CODING_CODE());
		ccc.add(cc);
		n.setCategory(ccc);

		
		
		List<Dosage> dosageArray = new ArrayList<Dosage>();
		Dosage dose = new Dosage();

		/******************** MED_DOSINSTX_DOSEQUANT_VAL ********************************************************************
		 * MED_DOSINSTX_DOSEQUANT_VAL maps to MedicationRequest / dosageInstruction / doseQuantity / value
		 ********************************************************************************************************************/
		if(medication.getMED_DOSINSTX_DOSEQUANT_VAL() != null)
		{
			List<DosageDoseAndRateComponent> theDoseAndRate = new ArrayList<>();			
			DosageDoseAndRateComponent e = new DosageDoseAndRateComponent();
			
			e.setDose(new SimpleQuantity()
					.setValue(Double.parseDouble(medication.getMED_DOSINSTX_DOSEQUANT_VAL())));
			
			theDoseAndRate.add(e);
			
			dose.setDoseAndRate(theDoseAndRate);
		}
		
		/******************** MED_DOSINSTX_DOSEQUANT_UNIT ********************************************************************
		 * MED_DOSINSTX_DOSEQUANT_UNIT maps to MedicationRequest / dosageInstruction / doseQuantity / unit
		 ********************************************************************************************************************/
		List<DosageDoseAndRateComponent> theDoseAndRate = new ArrayList<>();			
		DosageDoseAndRateComponent e = new DosageDoseAndRateComponent();
		
		e.setDose(new SimpleQuantity()
				.setUnit(medication.getMED_DOSINSTX_DOSEQUANT_UNIT()));
		
		theDoseAndRate.add(e);
		
		dose.setDoseAndRate(theDoseAndRate);
		
		/******************** MED_DOSINSTX_TEXT *****************************************************************************
		 * MED_DOSINSTX_TEXT maps to MedicationRequest / dosageInstruction / text
		 ********************************************************************************************************************/
		dose.setText(medication.getMED_DOSINSTX_TEXT());
		
		/******************** MED_DOSINSTX_ASNDBOOL *************************************************************************
		 * MED_DOSINSTX_ASNDBOOL maps to MedicationRequest / dosageInstruction / asNeededBoolean
		 ********************************************************************************************************************/
		dose.setAsNeeded(new BooleanType().setValue(new Boolean(medication.getMED_DOSINSTX_ASNDBOOL())));
		
		/******************** MED_DOSINSTX_ROUTE ****************************************************************************
		 * MED_DOSINSTX_ROUTE maps to MedicationRequest / dosageInstruction / route
		 ********************************************************************************************************************/
		CodeableConcept medcc = new CodeableConcept();

		Coding cp = new Coding();
		cp.setCode(medication.getMED_DOSINSTX_ROUTE());
		medcc.addCoding(cp);
		dose.setRoute(medcc);

		dosageArray.add(dose);
		n.setDosageInstruction(dosageArray);
        
		/******************** MED_SUBSTITU_ALLOWED **************************************************************************
		 * MED_SUBSTITU_ALLOWED maps to MedicationRequest / substitution / allowed
		 ********************************************************************************************************************/
        if(medication.getMED_SUBSTITU_ALLOWED() != null)
        {
            MedicationRequestSubstitutionComponent mrsc = new MedicationRequestSubstitutionComponent();

			mrsc.setAllowed(new BooleanType(medication.getMED_SUBSTITU_ALLOWED()));

            n.setSubstitution(mrsc);
       
        }
        return n; 
	}
}
