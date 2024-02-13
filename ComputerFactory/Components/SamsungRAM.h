//
// Created by Pierf on 19/11/2023.
//

#ifndef COMPUTERFACTORY_SAMSUNGRAM_H
#define COMPUTERFACTORY_SAMSUNGRAM_H
class SamsungRAM {
private:
    double price;
public:
    SamsungRAM();


    double getPrice() const ;

     SamsungRAM* Clone() const;
    SamsungRAM(const SamsungRAM&);

    std::string getType();

    void initialize();
};

#endif //COMPUTERFACTORY_SAMSUNGRAM_H
