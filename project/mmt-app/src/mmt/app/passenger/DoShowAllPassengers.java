package mmt.app.passenger;

//import mmt.DefaultSelector;
//import mmt.DefaultVisitor;
import mmt.TicketOffice;
import mmt.Passenger;
import pt.tecnico.po.ui.Command;

//FIXME import other classes if necessary

/**
 * §3.3.1. Show all passengers.
 */
public class DoShowAllPassengers extends Command<TicketOffice> {

    /**
    * @param receiver
    */
    public DoShowAllPassengers(TicketOffice receiver) {
        super(Label.SHOW_ALL_PASSENGERS, receiver);
    }

    /** @see pt.tecnico.po.ui.Command#execute() */
    @Override
    public final void execute() {
        for (Passenger p: _receiver.getPassengers())
            _display.addLine(p.toString());
        _display.display();
    }
}
