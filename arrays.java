var stress_name = new Array(5);
var stress_description = new Array(5);

var behavioral_SR = new Array(5);
var emotional_SR = new Array(5);
var physical_SR = new Array(5);
var cognitive_SR = new Array(5);
var social_SR = new Array(3);

var personality_name = new Array(16);
var personality_description = new Array(16);

var dutyfiller_SR = new Array(3);
var mechanic_SR = new Array(3);
var nurturer_SR = new Array(3);
var artist_SR = new Array(3);
var protector_SR = new Array(3);
var idealist_SR = new Array(3);
var scientist_SR = new Array(3);
var thinker_SR = new Array(3);
var doer_SR = new Array(3);
var guardian_SR = new Array(3);
var performer_SR = new Array(3);
var caregiver_SR = new Array(3);
var inspirer_SR = new Array(3);
var giver_SR = new Array(3);
var visionary_SR = new Array(3);
var executive_SR = new Array(3);

var habits_SR = new Array(10);

stress_name = ["Behavioral Stress", "Emotional Stress", "Physical Stress", "Cognitive Stress", "Social Stress"];
stress_description = ["Not Available", 
"Emotional stress is the most common. This can occur after you go through an intense break up or divorce, lose a loved one, have a fight with your spouse or experience any other problem that causes you to feel depressed or anxious. Emotional stress often manifests in the same way that depression does. Emotional stress can occur when you feel overwhelmed at home or at work.",
"Physical stress refers to actual physical activities and events that wreak havoc on the human body. Physical stress can also include stress brought on by sleeping too much, not getting enough sleep, spending too many hours on your feet or working long hours.",
"Cognitive stress is related to the frequency in which the mind is at work. Cognitive stress is typically the result of a person overworking their mind. This could be due to anxious thoughts, fearful anticipation, poor concentration, or difficulty with memory.",
"Not Available"];

behavioural_SR = ["Laugh", "Attend therapy sessions", "Develop a positive self-talk habit"];
emotional_SR = ["Take up journaling", "Attend therapy sessions", "Go to the sauna"];
physical_SR	= ["Learn progressive muscle relaxation techniques", "Take up aromatherapy", "Take up acupuncture"]
cognitive_SR = ["Take up meditation", "Go to the sauna", "Take up colouring"];
social_SR = ["Interact with animals", "Interact with friends", "Interact with family"];

personality_name = ["ISTJ - The Duty Fulfiller", "ISTP - The Mechanic", "ISFJ - The Nurterer", "ISFP - The Artist", "INFJ - The Protector", "INFP - The Idealist", "INTJ - The Scientist", "INTP - The Thinker", "ESTP - The Doer", "ESTJ - The Guardian", "ESFP - The Performer", "ESFJ - The Caregiver", "ENFP - The Inspirer", "ENFJ - The Giver", "ENTP - The Visionary", "ENTJ - The Executive"];
personality_description	= ["Serious and quiet, interested in security and peaceful living. Extremely thorough, responsible, and dependable. Well-developed powers of concentration. Usually interested in supporting and promoting traditions and establishments. Well-organized and hard working, they work steadily towards identified goals. They can usually accomplish any task once they have set their mind to it.",
"Quiet and reserved, interested in how and why things work. Excellent skills with mechanical things. Risk-takers who they live for the moment. Usually interested in and talented at extreme sports. Uncomplicated in their desires. Loyal to their peers and to their internal value systems, but not overly concerned with respecting laws and rules if they get in the way of getting something done. Detached and analytical, they excel at finding solutions to practical problems.",
"Quiet, kind, and conscientious. Can be depended on to follow through. Usually puts the needs of others above their own needs. Stable and practical, they value security and traditions. Well-developed sense of space and function. Rich inner world of observations about people. Extremely perceptive of other's feelings. Interested in serving others.",
"Quiet, serious, sensitive and kind. Do not like conflict, and not likely to do things which may generate conflict. Loyal and faithful. Extremely well-developed senses, and aesthetic appreciation for beauty. Not interested in leading or controlling others. Flexible and open-minded. Likely to be original and creative. Enjoy the present moment.",
"Quietly forceful, original, and sensitive. Tend to stick to things until they are done. Extremely intuitive about people, and concerned for their feelings. Well-developed value systems which they strictly adhere to. Well-respected for their perserverence in doing the right thing. Likely to be individualistic, rather than leading or following.",
"Quiet, reflective, and idealistic. Interested in serving humanity. Well-developed value system, which they strive to live in accordance with. Extremely loyal. Adaptable and laid-back unless a strongly-held value is threatened. Usually talented writers. Mentally quick, and able to see possibilities. Interested in understanding and helping people.",
"Independent, original, analytical, and determined. Have an exceptional ability to turn theories into solid plans of action. Highly value knowledge, competence, and structure. Driven to derive meaning from their visions. Long-range thinkers. Have very high standards for their performance, and the performance of others. Natural leaders, but will follow if they trust existing leaders.",
"Logical, original, creative thinkers. Can become very excited about theories and ideas. Exceptionally capable and driven to turn theories into clear understandings. Highly value knowledge, competence and logic. Quiet and reserved, hard to get to know well. Individualistic, having no interest in leading or following others.",
"Friendly, adaptable, action-oriented. 'Doers' who are focused on immediate results. Living in the here-and-now, they're risk-takers who live fast-paced lifestyles. Impatient with long explanations. Extremely loyal to their peers, but not usually respectful of laws and rules if they get in the way of getting things done. Great people skills.",
"Practical, traditional, and organized. Likely to be athletic. Not interested in theory or abstraction unless they see the practical application. Have clear visions of the way things should be. Loyal and hard-working. Like to be in charge. Exceptionally capable in organizing and running activities. 'Good citizens' who value security and peaceful living.",
"People-oriented and fun-loving, they make things more fun for others by their enjoyment. Living for the moment, they love new experiences. They dislike theory and impersonal analysis. Interested in serving others. Likely to be the center of attention in social situations. Well-developed common sense and practical ability.",
"Warm-hearted, popular, and conscientious. Tend to put the needs of others over their own needs. Feel strong sense of responsibility and duty. Value traditions and security. Interested in serving others. Need positive reinforcement to feel good about themselves. Well-developed sense of space and function.",
"Enthusiastic, idealistic, and creative. Able to do almost anything that interests them. Great people skills. Need to live life in accordance with their inner values. Excited by new ideas, but bored with details. Open-minded and flexible, with a broad range of interests and abilities.",
"Popular and sensitive, with outstanding people skills. Externally focused, with real concern for how others think and feel. Usually dislike being alone. They see everything from the human angle, and dislike impersonal analysis. Very effective at managing people issues, and leading group discussions. Interested in serving others, and probably place the needs of others over their own needs.",
"Creative, resourceful, and intellectually quick. Good at a broad range of things. Enjoy debating issues, and may be into 'one-up-manship'. They get very excited about new ideas and projects, but may neglect the more routine aspects of life. Generally outspoken and assertive. They enjoy people and are stimulating company. Excellent ability to understand concepts and apply logic to find solutions.",
"Assertive and outspoken - they are driven to lead. Excellent ability to understand difficult organizational problems and create solid solutions. Intelligent and well-informed, they usually excel at public speaking. They value knowledge and competence, and usually have little patience with inefficiency or disorganization."];

dutyfulfiller_SR = ["Clean the house", "Learn time management strategies", "Take up scrapbooking"];
mechanic_SR	= ["Take things apart", "Tinker with woodshop and machine shop tools", "Not Available"];
nurturer_SR	= ["Take up gardening", "Adopt a pet", "Not Available"];
artist_SR = ["Take up gardening", "Learn to bullet journal", "Take up cooking"];
protector_SR = ["Maintain an aquarium", "Take up baking", "Learn to bullet journal"];
idealist_SR	= ["Learn cognitive behavioural therapy", "Read some books", "Not Available"];
scientist_SR = ["Read some books", "Work on a project (Startup)", "Attend a hackathon"];
thinker_SR = ["Take up cooking", "Nature walk", "Take up photography"];
doer_SR	= ["Take up hiking", "Not Available", "Not Available"];
guardian_SR	= ["Learn to fitness track", "Not Available", "Not Available"];
performer_SR = ["Attend improv classes", "Attend dance classes", "Attend music classes"];
caregiver_SR = ["Gratitude Journal", "Not Available", "Not Available"];
inspirer_SR	= ["Read some books", "Create posts of influence (Youtube videos, Linkedin posts, etc)", "Not Available"];
giver_SR = ["Donate to local food drive", "Donate clothes", "Not Available"];
visionary_SR = ["Throw a small party", "Not Available", "Not Available"];
executive_SR = ["Not Available", "Not Available", "Not Available"];

habits_SR = ["Chew gum", "Light a candle", "Drink tea or water", "Exercise", "Get a hug from a loved one", "Correct your posture", "Unclench your muscles", "Stretch", "Look up at the sky", "Take deep breaths"];