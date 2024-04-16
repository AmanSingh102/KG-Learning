package Java_4_Collection_And_Generics.Java_54_WeekDay_And_Weekend;

public enum Day
{
    MONDAY(true),
    TUESDAY(true),
    WEDUESDAY(true),
    THURSDAY(true),
    FRIDAY(true),
    SATURDAY(false),
    SUNDAY(false);

    private final boolean isWeekDay;

    Day(boolean isWeekDay)
    {
        this.isWeekDay = isWeekDay;
    }

    public String getType()
    {
        return isWeekDay ? "Weekday" : "Weekend";
    }
}
