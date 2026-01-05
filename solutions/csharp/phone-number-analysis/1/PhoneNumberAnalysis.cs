public static class PhoneNumber
{
    public static (bool IsNewYork, bool IsFake, string LocalNumber) Analyze(string phoneNumber)
    {
        string[] phoneNumberArray = phoneNumber.Split('-');
        return (phoneNumberArray[0] == "212", phoneNumberArray[1] == "555", phoneNumberArray[2]);
    }

    public static bool IsFake((bool IsNewYork, bool IsFake, string LocalNumber) phoneNumberInfo) => phoneNumberInfo.IsFake;
}
