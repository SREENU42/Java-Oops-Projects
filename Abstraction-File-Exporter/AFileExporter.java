// ✅ 2️⃣ File Exporter (PDF / Excel / Text)

// Concepts: Interface-based abstraction
// Interface: FileExporter
// void export(String data);
// Implementations:
// PDFExporter
// ExcelExporter
// TextExporter
// Main:
// Allow user to select format → abstraction hides how exporting happens.
// Use-case:
// Client only interacts with FileExporter, not knowing implementation details.


import java.util.Scanner;

interface FileExporter{
  void export(String date);
}

class PDFExporter implements FileExporter{
  @Override
  publicvoid export(String data){
    System.out.println("Exporing data in pdf");
    System.out.println("PDF Data:"+data);
    
  }
}
class ExcelExporter implements FileExporter{
  @Override
   public void export(String data){
    System.out.println("Exporing data in Excel");
    System.out.println("Excel Data:"+data);
  }
}
class TextExporter implements FileExporter{
  @Override
   public void export(String data){
    System.out.println("Exporing data in Text");
    System.out.println("text Data:"+data);
  }
}

public class AFileExporter{
  public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
  
    System.out.println("Enter Export format:");
    System.out.println("1.PDFExporter");
    System.out.println("2.ExcelExporter");
    System.out.println("3.textExporter");


    int choice=sc.nextInt();
    sc.nextLine();
    System.out.println("Enter data to export: ");
    String data=sc.nextLine();
    
    FileExporter exporter;
    
    switch(choice){
      case 1:
        exporter =new PDFExporter();
        break;
      case 2:
        exporter =new ExcelExporter();
        break;
      case 3:
        exporter =new TextExporter();
        break;
        default:
            System.out.println("❌ Invalid Choice");
            return;
    }
    exporter.export(data);
  }
}