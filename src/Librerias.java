import java.applet.Applet;
import java.applet.AppletContext;
import java.applet.AppletStub;
import java.applet.AudioClip;
import java.awt.AWTError;
import java.awt.AWTEvent;
import java.awt.AWTEventMulticaster;
import java.awt.AWTException;
import java.awt.AWTKeyStroke;
import java.awt.ActiveEvent;
import java.awt.Adjustable;
import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.BufferCapabilities;
import java.awt.Button;
import java.awt.Canvas;
import java.awt.CardLayout;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.CheckboxMenuItem;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Composite;
import java.awt.CompositeContext;
import java.awt.Container;
import java.awt.ContainerOrderFocusTraversalPolicy;
import java.awt.Cursor;
import java.awt.DefaultFocusTraversalPolicy;
import java.awt.DefaultKeyboardFocusManager;
import java.awt.Desktop;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.DisplayMode;
import java.awt.Event;
import java.awt.EventQueue;
import java.awt.FileDialog;
import java.awt.FlowLayout;
import java.awt.FocusTraversalPolicy;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.FontMetrics;
import java.awt.Frame;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsConfigTemplate;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridBagLayoutInfo;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.IllegalComponentStateException;
import java.awt.Image;
import java.awt.ImageCapabilities;
import java.awt.Insets;
import java.awt.ItemSelectable;
import java.awt.JobAttributes;
import java.awt.KeyEventDispatcher;
import java.awt.KeyEventPostProcessor;
import java.awt.KeyboardFocusManager;
import java.awt.Label;
import java.awt.LayoutManager;
import java.awt.LayoutManager2;
import java.awt.LinearGradientPaint;
import java.awt.List;
import java.awt.MediaTracker;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuComponent;
import java.awt.MenuContainer;
import java.awt.MenuItem;
import java.awt.MenuShortcut;
import java.awt.MouseInfo;
import java.awt.MultipleGradientPaint;
import java.awt.PageAttributes;
import java.awt.Paint;
import java.awt.PaintContext;
import java.awt.Panel;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.Polygon;
import java.awt.PopupMenu;
import java.awt.PrintGraphics;
import java.awt.PrintJob;
import java.awt.RadialGradientPaint;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Robot;
import java.awt.ScrollPane;
import java.awt.ScrollPaneAdjustable;
import java.awt.Scrollbar;
import java.awt.SecondaryLoop;
import java.awt.Shape;
import java.awt.SplashScreen;
import java.awt.Stroke;
import java.awt.SystemColor;
import java.awt.SystemTray;
import java.awt.TextArea;
import java.awt.TextComponent;
import java.awt.TextField;
import java.awt.TexturePaint;
import java.awt.Toolkit;
import java.awt.Transparency;
import java.awt.TrayIcon;
import java.awt.Window;

import javax.accessibility.Accessible;
import javax.accessibility.AccessibleAction;
import javax.accessibility.AccessibleAttributeSequence;
import javax.accessibility.AccessibleBundle;
import javax.accessibility.AccessibleComponent;
import javax.accessibility.AccessibleContext;
import javax.accessibility.AccessibleEditableText;
import javax.accessibility.AccessibleExtendedComponent;
import javax.accessibility.AccessibleExtendedTable;
import javax.accessibility.AccessibleExtendedText;
import javax.accessibility.AccessibleHyperlink;
import javax.accessibility.AccessibleHypertext;
import javax.accessibility.AccessibleIcon;
import javax.accessibility.AccessibleKeyBinding;
import javax.accessibility.AccessibleRelation;
import javax.accessibility.AccessibleRelationSet;
import javax.accessibility.AccessibleResourceBundle;
import javax.accessibility.AccessibleRole;
import javax.accessibility.AccessibleSelection;
import javax.accessibility.AccessibleState;

import javax.activation.ActivationDataFlavor;
import javax.activation.ActivationDataFlavor;
import javax.activation.CommandMap;
import javax.activation.CommandObject;
import javax.activation.DataContentHandler;
import javax.activation.DataContentHandlerFactory;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.activation.FileTypeMap;
import javax.activation.MailcapCommandMap;
import javax.activation.MimeType;
import javax.activation.MimeTypeParameterList;
import javax.activation.MimeTypeParseException;
import javax.activation.MimetypesFileTypeMap;

import javax.activity.ActivityCompletedException;
import javax.activity.ActivityRequiredException;
import javax.activity.InvalidActivityException;

import javax.annotation.Generated;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import javax.annotation.Resources;
import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.Completion;
import javax.annotation.processing.Completions;
import javax.annotation.processing.Filer;
import javax.annotation.processing.FilerException;
import javax.annotation.processing.Messager;
import javax.annotation.processing.ProcessingEnvironment;

import javax.crypto.AEADBadTagException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.CipherSpi;
import javax.crypto.EncryptedPrivateKeyInfo;
import javax.crypto.ExemptionMechanism;
import javax.crypto.ExemptionMechanismException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyAgreement;
import javax.crypto.KeyAgreementSpi;
import javax.crypto.KeyGenerator;
import javax.crypto.KeyGeneratorSpi;

import javax.imageio.IIOException;
import javax.imageio.IIOImage;
import javax.imageio.IIOParam;
import javax.imageio.IIOParamController;
import javax.imageio.ImageIO;
import javax.imageio.ImageReadParam;
import javax.imageio.ImageReader;
import javax.imageio.ImageTranscoder;
import javax.imageio.ImageTypeSpecifier;
import javax.imageio.ImageWriteParam;
import javax.imageio.ImageWriter;
import javax.imageio.event.IIOReadProgressListener;
import javax.imageio.event.IIOReadUpdateListener;
import javax.imageio.event.IIOReadWarningListener;
import javax.imageio.metadata.IIOInvalidTreeException;
import javax.imageio.metadata.IIOMetadata;
import javax.imageio.metadata.IIOMetadataController;
import javax.imageio.plugins.bmp.BMPImageWriteParam;
import javax.imageio.plugins.jpeg.JPEGHuffmanTable;
import javax.imageio.plugins.jpeg.JPEGImageReadParam;
import javax.imageio.spi.IIORegistry;
import javax.imageio.spi.IIOServiceProvider;
import javax.imageio.stream.FileCacheImageInputStream;
import javax.imageio.stream.FileCacheImageOutputStream;

import javax.jws.HandlerChain;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.InitParam;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPMessageHandler;
import javax.jws.soap.SOAPMessageHandlers;

import javax.lang.model.AnnotatedConstruct;
import javax.lang.model.SourceVersion;
import javax.lang.model.UnknownEntityException;
import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.element.AnnotationValue;
import javax.lang.model.element.AnnotationValueVisitor;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.ElementVisitor;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.Modifier;
import javax.lang.model.element.Name;
import javax.lang.model.type.ArrayType;
import javax.lang.model.type.DeclaredType;
import javax.lang.model.type.ErrorType;
import javax.lang.model.util.AbstractAnnotationValueVisitor6;
import javax.lang.model.util.AbstractAnnotationValueVisitor7;
import javax.lang.model.util.AbstractAnnotationValueVisitor8;

import javax.management.Attribute;
import javax.management.AttributeChangeNotification;
import javax.management.AttributeChangeNotificationFilter;
import javax.management.AttributeList;
import javax.management.AttributeNotFoundException;
import javax.management.AttributeValueExp;
import javax.management.BadAttributeValueExpException;
import javax.management.BadBinaryOpValueExpException;
import javax.management.BadStringOperationException;
import javax.management.DefaultLoaderRepository;
import javax.management.Descriptor;
import javax.management.DescriptorAccess;
import javax.management.DescriptorKey;

import javax.naming.AuthenticationException;
import javax.naming.AuthenticationNotSupportedException;
import javax.naming.BinaryRefAddr;
import javax.naming.Binding;
import javax.naming.CannotProceedException;
import javax.naming.CommunicationException;
import javax.naming.CompositeName;
import javax.naming.CompoundName;
import javax.naming.ConfigurationException;
import javax.naming.Context;
import javax.naming.ContextNotEmptyException;
import javax.naming.InitialContext;
import javax.naming.InsufficientResourcesException;
import javax.naming.InterruptedNamingException;
        
import javax.net.ServerSocketFactory;
import javax.net.SocketFactory;
import javax.net.ssl.CertPathTrustManagerParameters;
import javax.net.ssl.ExtendedSSLSession;
import javax.net.ssl.HandshakeCompletedEvent;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;

import javax.print.AttributeException;
/**
 *
 * @author Beto Jr
 */
public class Librerias {
    
}
