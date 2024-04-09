package Java_OOP.EXAM_Preparation._19_December_2023.climbers.models.climbing;

import Java_OOP.EXAM_Preparation._19_December_2023.climbers.models.climber.Climber;
import Java_OOP.EXAM_Preparation._19_December_2023.climbers.models.mountain.Mountain;

import java.util.Collection;

public class ClimbingImpl implements Climbing{
    @Override
    public void conqueringPeaks(Mountain mountain, Collection<Climber> climbers) {
        Collection<String> peakList = mountain.getPeaksList();
        for (Climber climber : climbers) {
            while (climber.canClimb() || peakList.iterator().hasNext()){
                climber.climb();
                String peak = peakList.iterator().next();
                climber.getRoster().getPeaks().add(peak);
                peakList.remove(peak);
            }
        }
    }
}
