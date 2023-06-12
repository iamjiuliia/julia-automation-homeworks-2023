public class Main {
    public static void main(String[] args) {
        Table coffeeTable = new Table( "Coffee Table",30,60,"Wooden");
        TableLeg coffeeTableLeg1 = new TableLeg("White" , "Circle", 5, 50 );
        TableLeg coffeeTableLeg2 = new TableLeg("White","Square", 5, 50);
        String tableSummary = "Hi!\nMy favourite table is " + coffeeTable.tableType + ".It is: " + coffeeTable.tableMaterial +"!\n" + "It's size is: "+ coffeeTable.tableWidth + "*" + coffeeTable.tableLength + ". \nIt has 2 " + coffeeTableLeg1.TableLegColor + " legs.\n";
        String tableLegsSummary = "First table leg is:" + coffeeTableLeg1.TableLegShape + coffeeTableLeg1.TableLegWidth + "*" + coffeeTableLeg1.TableLegLength;
        System.out.println(tableSummary);
        System.out.println(tableLegsSummary);
    }
}
