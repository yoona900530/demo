package com.itrip.dao.hotel;

import com.itrip.beans.pojo.Hotel;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface HotelMapper {
    List<Hotel> getHotels();
}
