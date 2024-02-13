//
// Created by Pierf on 18/11/2023.
//

#ifndef COMPUTERFACTORY_CPU_H
#define COMPUTERFACTORY_CPU_H

#include <string>

class CPU{
protected:
    double price{}, clock;

public:
    virtual void initialize();


    [[nodiscard]] double getPrice() const;

    CPU(const CPU& other);

    [[nodiscard]] virtual CPU* Clone() const;
    CPU();


    virtual std::string getType() ;
};





#endif //COMPUTERFACTORY_CPU_H
