package hometasks

import static hometasks.Days.FRIDAY
import static hometasks.Days.MONDAY
import static hometasks.Days.SATURDAY
import static hometasks.Days.SUNDAY
import static hometasks.Days.THURSDAY
import static hometasks.Days.TUESDAY
import static hometasks.Days.WEDNESDAY

class DaysHomeTask {

    public static void main(String[] args) {
        println("RANGE !!!!!!!!")
        Range daysRange = (MONDAY..SUNDAY)
        println(daysRange.size())
        assert WEDNESDAY in daysRange
        println(daysRange.from)
        println(daysRange.to)
        println("RANGE !!!!!!!!")
        println("LIST !!!!!!!!")
        List<Days> daysList = [SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY]
        println(daysList)
        daysList.remove(daysList.get(6))
        daysList.add(SATURDAY)
        println(daysList[3])
        println("LIST !!!!!!!!")
        println("MAP !!!!!!!!")
        Map<Integer, Days> daysMap = [1:SUNDAY, 2:MONDAY, 3:TUESDAY, 4:WEDNESDAY, 5:THURSDAY, 6:SATURDAY, 7:SUNDAY]
        println(daysMap)
        println(daysMap.getClass())
        println(daysMap.size())
        println(daysMap.values())

        println("MAP !!!!!!!!")
    }
}