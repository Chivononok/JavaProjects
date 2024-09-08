package streams;

import java.util.List;

interface CheckCity {
    City isPresent(List city, String cityName) throws NotFoundCity;
}
