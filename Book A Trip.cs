class BookTrip
{
  private int refNo;
  private string journeyDestination;
  private int journeyCost;
  //need to find a date and time type for these
  private int journeyTime;
  private string journeyDate;

  public string getJourneyDestination()
  {
    return journeyDestination;
  }
  public int getJourneyTime()
  {
    return journeyTime;
  }
  public int getJourneyCost()
  {
    return journeyCost;
  }
  public int getRefNo()
  {
    return refNo;
  }
  public void bookTrip()
  {
    //code goes here
    refNo += 1;
    getRefNo();
  }
  public void enterPaymentDetails()
  {
    //code goes here
  }
}
