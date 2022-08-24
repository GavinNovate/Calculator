import SwiftUI
import sharedUiiOS

struct ContentView: View {
    
    var body: some View {
        CalculatorUIView()
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}

struct CalculatorUIView: UIViewControllerRepresentable{
    
    func makeUIViewController(context: Context) -> some UIViewController {
        CalculatorUIKt.createCalculatorUI()
    }
    
    func updateUIViewController(_ uiViewController: UIViewControllerType, context: Context) {
        
    }
}
