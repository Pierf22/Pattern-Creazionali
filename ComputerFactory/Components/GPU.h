//
// Created by Pierf on 19/11/2023.
//

#ifndef COMPUTERFACTORY_GPU_H
#define COMPUTERFACTORY_GPU_H

#include <string>

class GPU {
protected:
    double price{};
    bool haveRTX{};
public:
    GPU(const GPU &);
    GPU();

    virtual GPU* Clone() const;

    double getPrice() const;


    virtual std::string getType();

    virtual void initialize();
};


#endif //COMPUTERFACTORY_GPU_H
