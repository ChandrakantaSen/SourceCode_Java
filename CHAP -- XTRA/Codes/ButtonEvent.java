import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

public class ButtonEvent extends Applet implements ActionListener 
{
  private Button b;

  public void init() {
    b = new Button("Click me");
    b.addActionListener(this);
    add (b);
  }

  public void actionPerformed (ActionEvent e) {
    // If the target of the event was our Button
    // In this example, the check is not 
    // Truly necessary as we only listen to
    // A single button
if (e.getSource () == b) {
      getGraphics().drawString("OUCH Buddy",20,20);
    }
  }
}
/* Components of an Event: Can be put under the following categories.

1. Event Object: When the user interacts with the application by clicking a mouse button or pressing a key an event is generated. The Operating System traps this event and the data associated with it. For example, info about time at which the event occurred, the event types (like keypress or mouse click). This data is then passed on to the application to which the event belongs. In Java, events are represented by objects, which describe the events themselves. And Java has a number of classes that describe and handle different categories of events.

2. Event Source: An event source is the object that generated the event. Example if you click a button an ActionEvent Object is generated. The object of the ActionEvent class contains information about the event.

3. Event-Handler: Is a method that understands the event and processes it. The event-handler method takes the Event object as a parameter. Java uses Event-Delegation Model :with JDK1.1 onwards; you can specify the objects that are to be notified when a specific event occurs. If the event is irrelevant, it is discarded. The four main components based on this model are Event classes, Event Listeners, Explicit event handling and Adapters. Let us take a closer look at them one by one.

Event Classes: The EventObject class is at the top of the event class hierarchy. It belongs to the java.util package. While most of the other event classes are present in java.awt.event package. The getSource() method of the EventObject class returns the object that initiated the event. The getId () method returns the nature of the event. For example, if a mouse event occurs, you can find out whether the event was click, a press, a move or release from the event object. AWT provides two conceptual types of events: Semantic and low-level events.



Semantic events are defined at a higher-level to encapsulate the semantics of user interface component’s model. Now let us see what are the various semantic event classes and what they generate: 

• An ActionEvent object is generated when a component is activated

• An AdjustmentEvent Object is generated when scrollbars and other adjustment elements are used.

• A TextEvent object is generated when text of a component is modified.

• An ItemEvent is generated when an item from a list, a choice or checkbox is selected.

Low-Level Events is one that represents a low-level input or windows-system occurrence on a visual component on the screen. The various low-level event classes and what they generate are as follows: 

• A ContainerEvent Object is generated when component are added or removed from container.

• A ComponentEvent object is generated when a component is resized, moved etc.

• A FocusEvent object is generated when component receives focus for input.

• A KeyEvent object is generated when key on keyboard is pressed, released etc.

• A WindowEvent object is generated when a window activity, like maximizing or close occurs.

• A MouseEvent object is generated when a mouse is used.

• A PaintEvent object is generated when component is painted.

Event Listeners: An object delegates the task of handling an event to an event listener. When an event occurs, an event object of the appropriate type (as illustrated below) is created. This object is passed to a Listener. A listener must implement the interface that has the method for event handling. A component can have multiple listeners, and a listener can be removed using removeActionListener () method. Next question in your mind must be what is an interface?. An Interface contains constant values and method declaration. The difference between classes and interface is that the methods in an interface are only declared and not implemented, that is, the methods do not have a body. What is the Need for interface? Are interfaces are used to define behavior protocols (standard behavior) that can be implemented by any class anywhere in the class hierarchy. The java.awt.event package contains definitions of all event classes and listener interface. The semantic listener interfaces define by AWT for the above mentioned semantic events are:
 ActionListener 

 AjdustmentListener 

 ItemListener 

TextListener 

The low-level event listeners are as follows: 

 ComponentListener 

 ContainerListener 

 FocusListener 

 KeyListener 

 MouseListener 

 MouseMotionListener 

 WindowsListener.
*/
