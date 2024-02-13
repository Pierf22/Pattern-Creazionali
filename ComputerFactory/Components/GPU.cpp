//
// Created by Pierf on 18/11/2023.
//
#include "GPU.h"

    void GPU::initialize() {
       price=0;
       haveRTX= false;
    }


double GPU::getPrice() const {
    return price;
}


GPU::GPU(const GPU & other) {
    price=other.price;
    haveRTX=other.haveRTX;


}


GPU* GPU::Clone() const {
    return new GPU(*this);
}

GPU::GPU() {

}

std::string GPU::getType() {
    return "integrata";
}
