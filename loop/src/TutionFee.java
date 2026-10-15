void main() {
    int tuitionFee = 0;
    int annualSpend = 0;
    for(int grade =0; grade < 8; grade++){
        if(grade == 0){
            tuitionFee = 80;
        } else {
            tuitionFee = (60 * grade);
        }

        for(int classRoom = 1; classRoom<=3;classRoom++){
            for(int month = 1; month <= 9; month++){
                System.out.println("%s grade - room %s - %s month - tuition fees : %s"
                        .formatted(grade,classRoom,month,tuitionFee));
                annualSpend += tuitionFee;
            }
        }

        System.out.println("Grade %s annual fees : %s".formatted(grade,annualSpend));
        System.out.println();
    }
}